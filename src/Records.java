public class Records {


    public static void main(String[] args) {
        record UserDetail(String firstName, String LastName, String emailId) {
        }
        UserDetail userDetail = new UserDetail("Vishal", "Patel", "vishal@patel.com");
        System.out.println(userDetail.firstName);
        System.out.println(userDetail.emailId);
        System.out.println("Hashcode Record: " + userDetail.hashCode());
        System.out.println("ToString Record: " + userDetail.toString());
    }
}
