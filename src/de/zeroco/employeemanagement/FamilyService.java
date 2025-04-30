//package de.zeroco.employeemanagement;
//
//import java.io.FileReader;
//import java.io.FileWriter;
//import java.io.IOException;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.regex.Pattern;
//import com.opencsv.CSVReader;
//import com.opencsv.CSVWriter;
//
//public class FamilyService {
//
//    public static boolean validateDetails(Family member) {
//       
//    }
//
//    public String save(Family member) {
//        if (member == null || validateDetails(member)) return "";
//        if (Family.getFilePath() == null || Family.getFilePath().trim().isEmpty()) return "";
//        String id = getNextId();
//        member.setId(id);
//        if (checkEmail(member.getEmail())) {
//            try (CSVWriter writer = new CSVWriter(new FileWriter(Family.getFilePath(), true))) {
//                String[] array = member.toString().split(",");
//                writer.writeNext(array);
//                return "ID " + id;
//            } catch (IOException e) {
//                e.printStackTrace();
//                return "";
//            }
//        }
//        return "";
//    }
//
////    public static boolean checkEmail(String email) {
////        if (Family.getFilePath().length() == 0) return true;
////        try (CSVReader reader = new CSVReader(new FileReader(Family.getFilePath()))) {
////            List<String[]> allRows = reader.readAll();
////            for (int i = 1; i < allRows.size(); i++) {
////                String[] values = allRows.get(i);
////                if (values[4].equalsIgnoreCase(email)) {
////                    return false;
////                }
////            }
////        } catch (IOException e) {
////            e.printStackTrace();
////        }
////        return true;
////    }
//
//    public static String getNextId() {
//        int lastId = 0;
//        if (Family.getFilePath().length() == 0) return "f1"; // Default first ID
//        try (CSVReader reader = new CSVReader(new FileReader(Family.getFilePath()))) {
//            List<String[]> allRows = reader.readAll();
//            if (allRows.size() == 1) return "f1"; // Default first ID
//            String[] lastRow = allRows.get(allRows.size() - 1);
//            String lastIdStr = lastRow[0]; // Assuming the ID is the first column (nick_name)
//
//            // Extract the number part from the last ID (e.g., "f1" -> 1)
//            int lastNumber = Integer.parseInt(lastIdStr.substring(1));
//            lastId = lastNumber;
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        return "f" + (lastId + 1); // Increment the last number and return the new ID (e.g., "f2")
//    }
//
//    public static List<Family> list() {
//        List<Family> members = new ArrayList<>();
//        try (CSVReader reader = new CSVReader(new FileReader(Family.getFilePath()))) {
//            List<String[]> allRows = reader.readAll();
//            for (int i = 1; i < allRows.size(); i++) {
//                String[] array = allRows.get(i);
//                String csvRow = String.join(",", array);
//                Family member = Family.toObject(csvRow);
//                member.setId(array[0]); // Set the ID (nick_name)
//                members.add(member);
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        return members;
//    }
//
//    public static String delete(String id) {
//        if (id == null || id.trim().isEmpty()) return "";
//        List<String[]> allRows = new ArrayList<>();
//        boolean isDeleted = false;
//        try (CSVReader reader = new CSVReader(new FileReader(Family.getFilePath()))) {
//            allRows = reader.readAll();
//        } catch (IOException e) {
//            e.printStackTrace();
//            return "";
//        }
//        List<String[]> updatedRows = new ArrayList<>();
//        if (allRows.size() > 0) {
//            updatedRows.add(allRows.get(0)); // Add the headers
//            for (int i = 1; i < allRows.size(); i++) {
//                String[] row = allRows.get(i);
//                if (row[0].equalsIgnoreCase(id)) {
//                    isDeleted = true; // Mark as deleted
//                } else {
//                    updatedRows.add(row);
//                }
//            }
//        }
//        if (isDeleted) {
//            try (CSVWriter writer = new CSVWriter(new FileWriter(Family.getFilePath()))) {
//                writer.writeAll(updatedRows); // Write updated data back to the file
//            } catch (IOException e) {
//                e.printStackTrace();
//                return "";
//            }
//        }
//        return "ID " + id + " Deleted";
//    }
//}
