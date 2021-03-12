package arrayList;

import java.util.*;

/**
 * This program demonstrates the ArrayList class.
 * @version 1.11 2012-01-26
 * @author Cay Horstmann
 */
public class ArrayListTest
{
   public static void main(String[] args)
   {
      // fill the staff array list with three Employee objects
      var staff = new ArrayList<Employee>();

      staff.add(new Employee("Carl Cracker", 75000, 1987, 12, 15));
      staff.add(new Employee("Harry Hacker", 50000, 1989, 10, 1));
      staff.add(new Employee("Tony Tester", 40000, 1990, 3, 15));
//      Employee[] a = new Employee[staff.size()];
//      staff.toArray(a); //将arraylist数组元素拷贝至数组a，方便操作单个元素
//      System.out.println(a[0].getHireDay());
      // raise everyone's salary by 5%
      for (Employee e : staff)
         e.raiseSalary(5);

      // print out information about all Employee objects
      for (Employee e : staff)
         System.out.println("name=" + e.getName() + ",salary=" + e.getSalary() + ",hireDay=" 
            + e.getHireDay());
   }
}
