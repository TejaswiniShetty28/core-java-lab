package de.zeroco.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

/**
 * The GameParticipation class is designed to determine and display the games that each student in a group participates in.
 * It processes data about students and their participation in cricket, badminton, and carroms, ensuring that every student
 * is listed as participating in essay writing by default. The class uses ArrayLists for flexible data management.
 *
 * @since 30-01-2025
 * @author Tejaswini.S
 * @reviewed 
 */
public class GameParticipation {

    /**
     * This method processes all students and returns a formatted string with the games each student plays.
     * It checks for each student whether they are part of the cricket, badminton, or carrom teams
     * and appends the respective games to the result string. In addition to the sports, it also adds
     * "essay writing" as a default activity for every student.
     *
     * @since 30-01-2025
     * @author Tejaswini.S
     * @param studentsId ArrayList of all student IDs
     * @param cricket ArrayList of cricket players
     * @param badminton ArrayList of badminton players
     * @param carrom ArrayList of carrom players
     * @return String, a formatted string containing each student ID along with the games they play
     * @reviewed by 
     */
    public static String getStudentGameList(ArrayList<Integer> studentsId, ArrayList<Integer> cricket, ArrayList<Integer> badminton,  ArrayList<Integer> carrom) {
        String res = "";
        for (Integer studentId : studentsId) {
            String games = "";
            
            if (isStudentInGame(carrom, studentId)) {
                games += "carroms, ";
            }
            if (isStudentInGame(cricket, studentId)) {
                games += "cricket, ";
            }
            if (isStudentInGame(badminton, studentId)) {
                games += "badminton, ";
            }
            
            res += studentId + " plays: " + games + "essay writing\n";
        }
        return res;
    }

    /**
     * This method checks if a given student ID exists in the ArrayList.
     *
     * @since 30-01-2025
     * @author Tejaswini.S
     * @param sports ArrayList of players in a sport
     * @param studentId ID of the student to check
     * @return true if the student ID is found in the ArrayList, false otherwise
     * @reviewed by 
     */
    public static boolean isStudentInGame(ArrayList<Integer> sports, Integer studentId) {
        return sports.contains(studentId);
    }

    /**
     * Validates the sports team size and checks for duplicate student IDs.
     * 
     * @since 30-01-2025
     * @author Tejaswini.S
     * @param sportsName Name of the sport being validated
     * @param sports ArrayList of student IDs in the team
     * @param size Required team size
     * @throws IllegalArgumentException if team size is invalid or contains duplicates
     */
    public static void sportsValidation(String sportsName, ArrayList<Integer> sports, int size) {
        if (sports.size() < size || sports.size() > size || sports.isEmpty()) {
            throw new IllegalArgumentException(sportsName + " team size must be exactly " + size);
        }
        HashSet<Integer> uniqueIds = new HashSet<Integer>();
        for (Integer studentId : sports) {
            if (!uniqueIds.add(studentId)) {
                throw new IllegalArgumentException(sportsName + " team contains duplicate student ID: " + studentId);
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> studentsId = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20));
        ArrayList<Integer> carromTeam = new ArrayList<>(Arrays.asList(2, 5, 6, 13));
        ArrayList<Integer> cricketTeam = new ArrayList<>(Arrays.asList(12, 1, 20, 7, 8, 2, 5, 6, 13, 11, 9, 3, 19));
        ArrayList<Integer> badmintonTeam = new ArrayList<>(Arrays.asList(4, 10, 14, 15));
        try {
            sportsValidation("Carrom", carromTeam, 4);
            sportsValidation("Cricket", cricketTeam, 13);
            sportsValidation("Badminton", badmintonTeam, 4);
            System.out.println(getStudentGameList(studentsId, cricketTeam, badmintonTeam, carromTeam));
        } catch (IllegalArgumentException e) {
            System.out.println("Validation Error: " + e.getMessage());
        }
    }
    
}
