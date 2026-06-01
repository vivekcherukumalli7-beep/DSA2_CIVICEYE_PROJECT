
import java.util.Scanner;

class Incident {
    int incidentId;
    String category;
    String location;
    String priority;
    String status;

    Incident(int incidentId, String category, String location,
             String priority, String status) {
        this.incidentId = incidentId;
        this.category = category;
        this.location = location;
        this.priority = priority;
        this.status = status;
    }

    void display() {
        System.out.println("-----------------------------------");
        System.out.println("Incident ID : " + incidentId);
        System.out.println("Category    : " + category);
        System.out.println("Location    : " + location);
        System.out.println("Priority    : " + priority);
        System.out.println("Status      : " + status);
    }
}

public class CivicEye {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=== CIVICEYE INCIDENT MONITORING SYSTEM ===");

        System.out.print("Enter Incident ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Category: ");
        String category = sc.nextLine();

        System.out.print("Enter Location: ");
        String location = sc.nextLine();

        System.out.print("Enter Priority (High/Medium/Low): ");
        String priority = sc.nextLine();

        System.out.print("Enter Status (Reported/In Progress/Resolved): ");
        String status = sc.nextLine();

        Incident incident = new Incident(id, category, location,
                                         priority, status);

        System.out.println("\n=== INCIDENT DETAILS ===");
        incident.display();

        sc.close();
    }
}