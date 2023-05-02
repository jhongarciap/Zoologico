package Utilities;

import Model.SaleBill;
import com.itextpdf.text.BadElementException;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import java.io.FileOutputStream;
import java.util.List;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Image;

import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.rendering.PDFRenderer;

public class SalesReport {

    public SalesReport(String url) throws Exception {
        generateReport(url);
        displayPDF(url);
    }

    public static void addTitleTable(Document document) throws DocumentException {
        Font titleFont = new Font(Font.FontFamily.HELVETICA, 28, Font.BOLD, BaseColor.BLACK);
        Paragraph title = new Paragraph("Reporte de Ventas", titleFont);
        title.setAlignment(Element.ALIGN_CENTER);
        title.setSpacingAfter(3);
        document.add(title);
    }

    public static void createSalesTable(Document document, List<SaleBill> saleBills) throws DocumentException {
        PdfPTable table = new PdfPTable(new float[]{1, 1.5f, 1, 1, 1, 1.5f, 2, 2, 1.5f});
        table.setWidthPercentage(100);

        Font headerFont = new Font(Font.FontFamily.HELVETICA, 12, Font.BOLD, BaseColor.WHITE);
        BaseColor headerBgColor = new BaseColor(89, 89, 89);

        PdfPCell cell = new PdfPCell(new Phrase("Fecha", headerFont));
        cell.setHorizontalAlignment(Element.ALIGN_CENTER);
        cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
        cell.setBackgroundColor(headerBgColor);
        table.addCell(cell);

        cell = new PdfPCell(new Phrase("Código", headerFont));
        cell.setHorizontalAlignment(Element.ALIGN_CENTER);
        cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
        cell.setBackgroundColor(headerBgColor);
        table.addCell(cell);

        cell = new PdfPCell(new Phrase("Valor", headerFont));
        cell.setHorizontalAlignment(Element.ALIGN_CENTER);
        cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
        cell.setBackgroundColor(headerBgColor);
        table.addCell(cell);

        cell = new PdfPCell(new Phrase("Descuento", headerFont));
        cell.setHorizontalAlignment(Element.ALIGN_CENTER);
        cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
        cell.setBackgroundColor(headerBgColor);
        table.addCell(cell);

        cell = new PdfPCell(new Phrase("Cantidad", headerFont));
        cell.setHorizontalAlignment(Element.ALIGN_CENTER);
        cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
        cell.setBackgroundColor(headerBgColor);
        table.addCell(cell);

        cell = new PdfPCell(new Phrase("Total de Venta", headerFont));
        cell.setHorizontalAlignment(Element.ALIGN_CENTER);
        cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
        cell.setBackgroundColor(headerBgColor);
        table.addCell(cell);

        cell = new PdfPCell(new Phrase("Cliente", headerFont));
        cell.setHorizontalAlignment(Element.ALIGN_CENTER);
        cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
        cell.setBackgroundColor(headerBgColor);
        table.addCell(cell);

        cell = new PdfPCell(new Phrase("Producto", headerFont));
        cell.setHorizontalAlignment(Element.ALIGN_CENTER);
        cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
        cell.setBackgroundColor(headerBgColor);
        table.addCell(cell);

        cell = new PdfPCell(new Phrase("ID del Producto", headerFont));
        cell.setHorizontalAlignment(Element.ALIGN_CENTER);
        cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
        cell.setBackgroundColor(headerBgColor);
        table.addCell(cell);

        Font dataFont = new Font(Font.FontFamily.HELVETICA, 10, Font.NORMAL, BaseColor.BLACK);

        for (SaleBill sale : saleBills) {
            table.addCell(new Phrase(sale.getDate(), dataFont));
            table.addCell(new Phrase(sale.getCode(), dataFont));
            table.addCell(new Phrase(String.valueOf(sale.getValue()), dataFont));
            table.addCell(new Phrase(String.valueOf(sale.getDiscount()), dataFont));
            table.addCell(new Phrase(String.valueOf(sale.getAmount()), dataFont));
            table.addCell(new Phrase(String.valueOf(sale.getTotalvalue()), dataFont));
            table.addCell(new Phrase(sale.getCostormerName(), dataFont));
            table.addCell(new Phrase(sale.getProduct(), dataFont));
            table.addCell(new Phrase(sale.getProductld(), dataFont));
        }
        document.add(table);
    }

    public static void calculateTotalSales(Document document, List<SaleBill> saleBills) throws DocumentException {
        double totalSales = 0;
        for (SaleBill sale : saleBills) {
            totalSales += sale.getTotalvalue();
        }

        PdfPTable totalSalesTable = new PdfPTable(1);
        totalSalesTable.setWidthPercentage(100);
        totalSalesTable.getDefaultCell().setPaddingTop(10f);
        totalSalesTable.getDefaultCell().setPaddingBottom(10f);
        totalSalesTable.getDefaultCell().setBackgroundColor(new BaseColor(230, 230, 230));

        Font totalFont = new Font(Font.FontFamily.HELVETICA, 14, Font.BOLD, BaseColor.BLACK);

        PdfPCell totalSalesCell = new PdfPCell(new Phrase(String.format("Total de ventas: %.2f", totalSales), totalFont));
        totalSalesCell.setBorder(0);
        totalSalesCell.setHorizontalAlignment(Element.ALIGN_RIGHT);

        totalSalesTable.addCell(totalSalesCell);

        document.add(totalSalesTable);
    }

    public static void generateReport(String url) throws Exception {
        List<SaleBill> saleBills = readSalesFromExcel("rom/Bills/BillSale.xlsx");
        Document document = new Document(PageSize.A4.rotate());
        PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream(url));
        document.open();
        addHeader(document);
        addTitleTable(document);
        createSalesTable(document, saleBills);
        calculateTotalSales(document, saleBills);
        addFooter(document);
        document.close();
    }

    public static void addLogo(Document document, String direction) throws BadElementException, IOException, DocumentException {
        Image image = Image.getInstance(direction);
        image.setAlignment(Element.ALIGN_RIGHT); // Alinear el logo a la derecha
        image.scaleToFit(PageSize.A4.getWidth() * 0.4f, PageSize.A4.getHeight() * 0.1f);
        image.setSpacingAfter(10);
        document.add(image);
    }

    public static void addTitleHeader(Document document, String tl) throws DocumentException {
        // Crear la fuente para el título del encabezado
        Font titleFont = new Font(Font.FontFamily.HELVETICA, 24, Font.BOLD);
        titleFont.setColor(BaseColor.BLACK);
        // Agregar título del encabezado
        Paragraph title = new Paragraph(tl, titleFont);
        title.setAlignment(Element.ALIGN_LEFT); // Alinear el título a la izquierda
        title.setIndentationLeft(60); // Agregar un margen izquierdo
        title.setIndentationRight(100); // Agregar un margen derecho
        title.setSpacingAfter(5);
        document.add(title);
    }

    public static void addSubtitleHeader(Document document, String tl) throws DocumentException {
        // Crear la fuente para el subtítulo del encabezado
        Font subtitleFont = new Font(Font.FontFamily.HELVETICA, 12, Font.NORMAL, BaseColor.BLACK);
        // Agregar subtítulo del encabezado
        Paragraph subtitle = new Paragraph(tl, subtitleFont);
        subtitle.setAlignment(Element.ALIGN_LEFT); // Alinear el subtítulo a la izquierda
        subtitle.setIndentationLeft(60); // Agregar un margen izquierdo
        subtitle.setIndentationRight(100); // Agregar un margen derecho
        subtitle.setSpacingAfter(10);
        document.add(subtitle);
    }

    public static void addInfoHeader(Document document, String tl1, String tl2) throws DocumentException {
        Font contactFont = new Font(Font.FontFamily.HELVETICA, 10, Font.NORMAL, BaseColor.BLACK);
        Paragraph contact = new Paragraph(tl1, contactFont);
        contact.setAlignment(Element.ALIGN_LEFT);
        contact.setIndentationLeft(60);
        document.add(contact);

        contact = new Paragraph(tl2, contactFont);
        contact.setAlignment(Element.ALIGN_LEFT);
        contact.setIndentationLeft(60);
        contact.setSpacingAfter(20);
        document.add(contact);
    }

    public static void addHeader(Document document) throws Exception {
        addLogo(document, "C:\\Users\\aguir\\OneDrive\\Documentos\\NetBeansProjects\\Zoologico\\NoCode\\Logo Zoologico Reserva de la Vida@3x.png");
        addTitleHeader(document, "Zoológico Reserva de la Vida");
        addSubtitleHeader(document, "Calle 123, Ciudad, País");
        addInfoHeader(document, "Teléfono: 123-456-7890", "Correo electrónico: info@zooxyz.com");
        document.add(new Chunk("\n")); // Agregar espacio antes de la línea de separación
    }

    public static void addNameFooter(Paragraph footer, String tl) {
        // Agregar la información de la empresa
        Font companyFont = new Font(Font.FontFamily.HELVETICA, 8, Font.NORMAL, BaseColor.GRAY);
        Chunk companyChunk = new Chunk(tl, companyFont);
        footer.add(companyChunk);
    }

    public static void addDateFooter(Paragraph footer) {
        // Agregar la información de la fecha
        Font dateFont = new Font(Font.FontFamily.HELVETICA, 8, Font.NORMAL, BaseColor.GRAY);
        String date = LocalDate.now().toString();
        Chunk dateChunk = new Chunk(" | " + date, dateFont);
        footer.add(dateChunk);
    }

    public static void addNumberFooter(Paragraph footer, Document document) {
        int pageNumber = document.getPageNumber() + 1;
        int totalPages = document.getPageNumber() + 1;
        Font pageNumberFont = new Font(Font.FontFamily.HELVETICA, 8, Font.NORMAL, BaseColor.GRAY);
        Chunk pageNumberChunk = new Chunk(" | Página " + pageNumber + " de " + totalPages, pageNumberFont);
        footer.add(pageNumberChunk);
    }

    public static void addFooter(Document document) throws DocumentException {
        // Crear un pie de página
        Paragraph footer = new Paragraph();

        addNameFooter(footer, "Zoologico Reserva de la Vida");
        addDateFooter(footer);
        addNumberFooter(footer, document);

        // Alinear el pie de página al centro
        footer.setAlignment(Element.ALIGN_CENTER);

        // Agregar el pie de página al documento
        document.add(footer);
    }

    public static List<SaleBill> readSalesFromExcel(String url) throws Exception {
        List<SaleBill> saleBills;
        try (Workbook workbook = new XSSFWorkbook(url)) {
            Sheet sheet = workbook.getSheetAt(0);
            saleBills = new ArrayList<>();
            for (Row row : sheet) {
                // Ignoramos la primera fila, que contiene los encabezados de las columnas
                if (row.getRowNum() == 0) {
                    continue;
                }
                SaleBill sale = new SaleBill(row.getCell(0).getStringCellValue(),
                        row.getCell(1).getStringCellValue(),
                        (float) row.getCell(2).getNumericCellValue(),
                        (float) row.getCell(3).getNumericCellValue(),
                        (int) row.getCell(4).getNumericCellValue(),
                        (float) row.getCell(5).getNumericCellValue(),
                        row.getCell(6).getStringCellValue(),
                        row.getCell(7).getStringCellValue(),
                        row.getCell(8).getStringCellValue());
                saleBills.add(sale);
            }
        }
        return saleBills;
    }

    public static void displayPDF(String url) {
        File file = new File(url);
        try {
            try (PDDocument document = PDDocument.load(file)) {
                PDFRenderer renderer = new PDFRenderer(document);
                JLabel label = new JLabel();
                label.setIcon(new ImageIcon(renderer.renderImageWithDPI(0, 72)));
                JScrollPane scrollPane = new JScrollPane(label);
                Dimension size = label.getPreferredSize();
                scrollPane.setPreferredSize(new Dimension(size.width + 50, size.height + 50));
                JFrame frame = new JFrame();
                frame.getContentPane().add(scrollPane, BorderLayout.CENTER);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setTitle(file.getName());
                frame.pack();
                frame.setVisible(true);
            }
        } catch (IOException e) {
        }
    }

}
