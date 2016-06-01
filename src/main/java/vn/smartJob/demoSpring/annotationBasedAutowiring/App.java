package vn.smartJob.demoSpring.annotationBasedAutowiring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Ứng dụng chuyển tiền.
 *
 * @author SmartJob
 */
public class App {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        AccountService accountService = applicationContext.getBean("accountServiceImpl", AccountService.class);

        System.out.println("Trước khi chuyển tiền");
        System.out.println("Số dư trong tài khoản Hoàng Thế Anh:" + accountService.getAccount(1).getBalance());
        System.out.println("Số dư trong tài khoản Nguyễn Đức Hải:" + accountService.getAccount(2).getBalance());

        // Hoàng Thế Anh chuyển cho Nguyễn Đức Hải 4 triệu 200 nghìn đồng.
        accountService.transferMoney(1, 2, 4200000.0);

        System.out.println("---------------------------------------------------");
        System.out.println("Sau khi chuyển tiền");
        System.out.println("Số dư trong tài khoản Hoàng Thế Anh:" + accountService.getAccount(1).getBalance());
        System.out.println("Số dư trong tài khoản Nguyễn Đức Hải:" + accountService.getAccount(2).getBalance());
    }

}

// Kết quả:

//Trước khi chuyển tiền
//Số dư trong tài khoản Hoàng Thế Anh:8000000.0
//Số dư trong tài khoản Nguyễn Đức Hải:4000000.0
//---------------------------------------------------
//Sau khi chuyển tiền
//Số dư trong tài khoản Hoàng Thế Anh:3800000.0
//Số dư trong tài khoản Nguyễn Đức Hải:8200000.0
