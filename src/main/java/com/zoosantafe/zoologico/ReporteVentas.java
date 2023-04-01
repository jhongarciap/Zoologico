/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zoosantafe.zoologico;

import com.itextpdf.text.BadElementException;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ReporteVentas {

    public static void generarReporteVentas(List<Venta> ventas, String nombreArchivo) throws DocumentException, FileNotFoundException, BadElementException, IOException {
        // Crear documento PDF
        Document documento = new Document();
        PdfWriter.getInstance(documento, new FileOutputStream(nombreArchivo));
        documento.open();

        // Establecer colores y fuentes
        BaseColor colorFondoCabecera = new BaseColor(15, 105, 88);
        BaseColor colorTextoCabecera = new BaseColor(255, 255, 255);
        BaseColor colorFondoCelda = new BaseColor(18, 175, 120);
        BaseColor colorTextoCelda = new BaseColor(0, 0, 0);
        BaseColor colorTextoTotal = new BaseColor(239,221,62);
        Font fontTitulo = new Font(Font.FontFamily.HELVETICA, 18, Font.BOLD, colorFondoCabecera);
        Font fontSubtitulo = new Font(Font.FontFamily.HELVETICA, 12, Font.BOLD, colorFondoCabecera);
        Font fontCabecera = new Font(Font.FontFamily.HELVETICA, 14, Font.BOLD, colorTextoCabecera);

        //Agregar fecha
        Date hora = new Date();
        String hora2 = new SimpleDateFormat("dd/MM/yyyy").format(hora);
        Paragraph fecha = new Paragraph("Fecha: " + hora2, fontSubtitulo);
        fecha.setAlignment(Element.ALIGN_RIGHT);
        documento.add(fecha);

        // Espacio
        Paragraph saltoDeLinea = new Paragraph("\n");
        documento.add(saltoDeLinea);

        // Agregar logo
        Image logo = Image.getInstance("C:\\Users\\aguir\\OneDrive\\Documentos\\NetBeansProjects\\ave\\src\\ave\\Logo.png");
        logo.scaleToFit(150, 150);
        logo.setAlignment(Element.ALIGN_CENTER);
        documento.add(logo);

        //Espacio
        documento.add(saltoDeLinea);
        documento.add(saltoDeLinea);

        //Agregar titulo
        Paragraph titulo = new Paragraph("Reporte de Ventas", fontTitulo);
        titulo.setAlignment(Element.ALIGN_CENTER);
        documento.add(titulo);

        //Espacio
        documento.add(saltoDeLinea);
        documento.add(saltoDeLinea);

        // Agregar tabla de ventas
        PdfPTable tablaVentas = new PdfPTable(new float[]{3, 2, 2, 2, 2});
        tablaVentas.setWidthPercentage(100);

        PdfPCell celdaProducto = new PdfPCell(new Phrase("Producto", fontCabecera));
        celdaProducto.setHorizontalAlignment(Element.ALIGN_CENTER);
        celdaProducto.setBackgroundColor(colorFondoCabecera);
        tablaVentas.addCell(celdaProducto);

        PdfPCell celdaFecha = new PdfPCell(new Phrase("Fecha", fontCabecera));
        celdaFecha.setHorizontalAlignment(Element.ALIGN_CENTER);
        celdaFecha.setBackgroundColor(colorFondoCabecera);
        tablaVentas.addCell(celdaFecha);
        
        PdfPCell celdaValor = new PdfPCell(new Phrase("Valor", fontCabecera));
        celdaValor.setHorizontalAlignment(Element.ALIGN_CENTER);
        celdaValor.setBackgroundColor(colorFondoCabecera);
        tablaVentas.addCell(celdaValor);
        
        PdfPCell celdaCantidad = new PdfPCell(new Phrase("Cantidad", fontCabecera));
        celdaCantidad.setHorizontalAlignment(Element.ALIGN_CENTER);
        celdaCantidad.setBackgroundColor(colorFondoCabecera);
        tablaVentas.addCell(celdaCantidad);

        PdfPCell celdaMonto = new PdfPCell(new Phrase("Monto", fontCabecera));
        celdaMonto.setHorizontalAlignment(Element.ALIGN_CENTER);
        celdaMonto.setBackgroundColor(colorFondoCabecera);
        tablaVentas.addCell(celdaMonto);

        Font fontCelda = new Font(Font.FontFamily.HELVETICA, 12, Font.NORMAL, colorTextoCelda);
        double totalVentas = 0;
        for (Venta venta : ventas) {
            PdfPCell celdaProductoValor = new PdfPCell(new Phrase(venta.getProducto(), fontCelda));
            celdaProductoValor.setHorizontalAlignment(Element.ALIGN_CENTER);
            celdaProductoValor.setBackgroundColor(colorFondoCelda);
            tablaVentas.addCell(celdaProductoValor);

            PdfPCell celdaFechaValor = new PdfPCell(new Phrase(new SimpleDateFormat("dd/MM/yyyy").format(venta.getFecha()), fontCelda));
            celdaFechaValor.setHorizontalAlignment(Element.ALIGN_CENTER);
            celdaFechaValor.setBackgroundColor(colorFondoCelda);
            tablaVentas.addCell(celdaFechaValor);
            
            PdfPCell celdaValorValor = new PdfPCell(new Phrase(String.format("%.2f", venta.getValor()), fontCelda));
            celdaValorValor.setHorizontalAlignment(Element.ALIGN_CENTER);
            celdaValorValor.setBackgroundColor(colorFondoCelda);
            tablaVentas.addCell(celdaValorValor);
            
            PdfPCell celdaCantidadValor = new PdfPCell(new Phrase(String.format("%.0f", venta.getCantidad()), fontCelda));
            celdaCantidadValor.setHorizontalAlignment(Element.ALIGN_CENTER);
            celdaCantidadValor.setBackgroundColor(colorFondoCelda);
            tablaVentas.addCell(celdaCantidadValor);

            PdfPCell celdaMontoValor = new PdfPCell(new Phrase(String.format("%.2f", venta.getMonto()), fontCelda));
            celdaMontoValor.setHorizontalAlignment(Element.ALIGN_CENTER);
            celdaMontoValor.setBackgroundColor(colorFondoCelda);
            tablaVentas.addCell(celdaMontoValor);

            totalVentas += venta.getMonto();
        }

        PdfPCell celdaTotal = new PdfPCell(new Phrase("Total", fontCabecera));
        celdaTotal.setHorizontalAlignment(Element.ALIGN_CENTER);
        celdaTotal.setBackgroundColor(colorFondoCabecera);
        celdaTotal.setColspan(4);
        tablaVentas.addCell(celdaTotal);

        PdfPCell celdaTotalValor = new PdfPCell(new Phrase(String.format("%.2f", totalVentas), new Font(Font.FontFamily.HELVETICA, 12, Font.BOLD, colorTextoTotal)));
        celdaTotalValor.setHorizontalAlignment(Element.ALIGN_CENTER);
        celdaTotalValor.setBackgroundColor(colorFondoCabecera);
        tablaVentas.addCell(celdaTotalValor);

        //Agregar tabla de planes
        documento.add(tablaVentas);
        
        //Espacio
        documento.add(saltoDeLinea);
        documento.add(saltoDeLinea);
        documento.add(saltoDeLinea);

        //Agregar ubicacion, correo y telefono
        Paragraph ubicacion = new Paragraph("Cll 80 sur #55-71 (La Estrella, Antioquia)", fontSubtitulo);
        ubicacion.setAlignment(Element.ALIGN_CENTER);
        Paragraph correo = new Paragraph("zoologico@correogenerico.co", fontSubtitulo);
        correo.setAlignment(Element.ALIGN_CENTER);
        Paragraph telefono = new Paragraph("+57 318 493 3008", fontSubtitulo);
        telefono.setAlignment(Element.ALIGN_CENTER);
        documento.add(ubicacion);
        documento.add(correo);
        documento.add(telefono);

        documento.close();
    }

    public static void main(String[] args) throws DocumentException, FileNotFoundException, BadElementException, IOException {
        // Crear lista de ventas
        List<Venta> ventas = new ArrayList<>();
        ventas.add(new Venta(new Date(), "Producto 1", 100.0, 3));
        ventas.add(new Venta(new Date(), "Producto 2", 200.0, 4));
        ventas.add(new Venta(new Date(), "Producto 3", 300.0, 1));

        // Generar reporte de ventas
        generarReporteVentas(ventas, "C:\\Users\\aguir\\OneDrive\\Documentos\\NetBeansProjects\\ave\\src\\ave\\reporteVentas.pdf");
    }
}
