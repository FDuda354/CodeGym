package pl.codegym.task.task19.task1905;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collector;

/* 
Wzmocnij adapter
*/

public class Solution {

    public static Map<String,String> countries = new HashMap<>();

    static {
        countries.put("UA","Ukraina");
        countries.put("US","Stany Zjednoczone");
        countries.put("FR","Francja");
    }

    public static void main(String[] args) {

    }

    public static class DataAdapter implements RowItem{

        private Customer customer;
        private Contact contact;


        public DataAdapter(Customer customer, Contact contact) {
            this.customer = customer;
            this.contact = contact;
        }

        @Override
        public String getCountryCode() {

            return countries.entrySet().stream()
                    .filter(cod -> cod.getValue().equals(customer.getCountryName()))
                    .findFirst().get().getKey();

        }

        @Override
        public String getCompany() {
            return customer.getCompanyName();
        }

        @Override
        public String getContactFirstName() {
            return contact.getName().split(", ")[1];
        }

        @Override
        public String getContactLastName() {
            return contact.getName().split(", ")[0];
        }

        @Override
        public String getDialString() {
            return "callto://+" + contact.getPhoneNumber().replaceAll("\\D","");
        }
    }

    public static interface RowItem {
        String getCountryCode();        // Na przykład: US
        String getCompany();            // Na przykład: CodeGym Ltd.
        String getContactFirstName();   // Na przykład: John
        String getContactLastName();    // Na przykład: Peterson
        String getDialString();         // Na przykład: callto://+11112223333
    }

    public static interface Customer {
        String getCompanyName();        // Na przykład: CodeGym Ltd.
        String getCountryName();        // Na przykład: Stany Zjednoczone
    }

    public static interface Contact {
        String getName();               // Na przykład: Peterson, John
        String getPhoneNumber();        // Na przykład: +1(111)222-3333, +3(805)0123-4567, +380(50)123-4567, etc.
    }
}