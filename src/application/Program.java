package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class Program {

    public static void main(String[] args) {


        SellerDao sellerDao = DaoFactory.createSellerDao();


        //Seller seller = sellerDao.findById(3);
        System.out.println();
        Department dep = new Department(2, null);
        List<Seller> list = sellerDao.findByDepartment(dep);

        System.out.println();
        List<Seller> findAll = sellerDao.findAll();

        /*
        System.out.println("\n=== TEST 4: seller insert =====");
        LocalDate birthDate = LocalDate.of(1993, 10, 11);
        Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", Date.valueOf(birthDate), 4000.0, dep);
        sellerDao.insert(newSeller);
        System.out.println("Inserted! New id = " + newSeller.getId());

         */

        System.out.println("\n=== TEST 5: seller UPDATE =====");
        Seller seller = sellerDao.findById(1);
        seller.setName("Billy Bruto");
        seller.setEmail("fuckHomelander@gmail.com");
        sellerDao.update(seller);
        System.out.println("Update completed");

    }

;

       //findAll.forEach(System.out::println);

       //System.out.println(seller);
    }
