package Control.AdministrativeDepartment;

import Control.IList;
import Model.Plan;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author garci
 */
public class ArrayListPlan implements IList {

    private ArrayList<Plan> plans = new ArrayList<>();

    public ArrayListPlan() {
    }

    @Override
    public void add(Object o) {
        plans.add((Plan) o);
    }

    @Override
    public void saveExcel() {
        try {
            File file = new File("rom/Plans/Plans.xlsx");
            if (file.exists()) {
                XSSFWorkbook workbook;
                try ( FileInputStream fis = new FileInputStream(file)) {
                    workbook = new XSSFWorkbook(fis);
                    XSSFSheet sheet = workbook.getSheetAt(0);
                    int lastRow = sheet.getLastRowNum();
                    for (int i = 0; i < plans.size(); i++) {
                        lastRow++;
                        XSSFRow row = sheet.createRow(lastRow);
                        row.createCell(0).setCellValue(plans.get(i).getProductId());
                        row.createCell(1).setCellValue(plans.get(i).getProduct());
                        row.createCell(2).setCellValue(plans.get(i).getValue());
                        row.createCell(3).setCellValue(plans.get(i).getSfications());
                    }
                }

                try ( FileOutputStream fos = new FileOutputStream(file)) {
                    workbook.write(fos);
                }
            } else {
                XSSFWorkbook workbook = new XSSFWorkbook();
                XSSFSheet sheet = workbook.createSheet("Plans");

                XSSFRow row = sheet.createRow(0);
                row.createCell(0).setCellValue("Product ID");
                row.createCell(1).setCellValue("Product");
                row.createCell(2).setCellValue("Value");
                row.createCell(3).setCellValue("sfications");

                for (int i = 0; i < plans.size(); i++) {
                    row = sheet.createRow(i + 1);
                    row.createCell(0).setCellValue(plans.get(i).getProductId());
                    row.createCell(1).setCellValue(plans.get(i).getProduct());
                    row.createCell(2).setCellValue(plans.get(i).getValue());
                    row.createCell(3).setCellValue(plans.get(i).getSfications());
                }

                try ( FileOutputStream fos = new FileOutputStream(file)) {
                    workbook.write(fos);
                }
            }
        } catch (IOException e) {
            System.out.println("Hay un error, revisa.");
        }
    }

}
