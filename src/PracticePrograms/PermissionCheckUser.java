package PracticePrograms;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PermissionCheckUser {

    public void checkPermissionOfUser(String permUser) throws Exception{
        int counter=0;
        List<String> listPerms = new ArrayList<>();
        listPerms.add("createOrderViewPermission");
//        listPerms.add("createOrderSubmitPermission");
        listPerms.add("authOrderViewPermission");
        listPerms.add("authOrderSubmitPermission");
        listPerms.add("debitViewPermission");
        listPerms.add("creditViewPermission");
        listPerms.add("debitSubmitPermission");
        listPerms.add("creditSubmitPermission");
        listPerms.add("payPalCreditViewPermission");
        listPerms.add("standAloneCreditViewPermission");
        listPerms.add("directDebitViewPermission");

        System.out.println("The permissions are: "+listPerms);

        Iterator<String> iterator = listPerms.iterator();

        while(iterator.hasNext()){
            if(permUser.equals(iterator.next())){
                System.out.println("User has the submit permission to perform the operation");
                break;
            }
            else{
                counter+=1;
            }

            if(counter == listPerms.size()){
                System.out.println("The user doesn't have permission to perform the operation");
            }

        }

    }

    public static void main(String[] args) throws Exception{
        PermissionCheckUser permObj = new PermissionCheckUser();
        permObj.checkPermissionOfUser("createOrderSubmitPermission");
    }
}
