package assignment;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import java.util.Map.Entry;

public class EmplioyeeMainQue17 {

	
	 public static void main(String[] args) throws ParseException {
	        ArrayList<EmployeeQue17> I = new ArrayList<EmployeeQue17>();
	        I.add(new EmployeeQue17("abhishek", "1996-01-03", "22/05/2022", "22/05/2024", "hinjewadi", "JavaTraniee", 25000));
	        I.add(new EmployeeQue17("nilesh", "1993-11-05", "15/05/2021", "22/05/2029", "wakad", "PythonTraniee", 35000));
	        I.add(new EmployeeQue17("namdev", "2000-12-07", "22/05/2022", "22/05/2027", "indore", "JavaTraniee", 12000));
	        I.add(new EmployeeQue17("anurag", "2004-02-09", "22/05/2020", "22/05/2030", "pune", "SapTrainee", 40000));
	        I.add(new EmployeeQue17("ajinkya", "1997-23-05", "22/05/2019", "22/05/2023", "satara", "SapTrainee", 10000));
	        I.add(new EmployeeQue17("prakash", "1996-30-06", "22/05/2020", "22/05/2030", "hinjewadi", "JavaTraniee", 28000));

	        Scanner scan = new Scanner(System.in);
	        System.out.println(
	                " 1.to find department with max and min employees \n 2.employee in particular department \n 3.find employee experience \n 4.find average salary of employee by department \n 5.find highest and lowest salary of employee by department ");

	        while (true) {
	            int ch = scan.nextInt();
	            switch (ch) {
	            case 1:
	                Map<String, Long> a = I.stream()
	                        .collect(Collectors.groupingBy(EmployeeQue17::getDepartment, TreeMap::new, Collectors.counting()));
	                long maxValueInMap = (Collections.max(a.values()));
	                long min = (Collections.min(a.values()));
	                System.out.println(min);

	                for (Entry<String, Long> entry : a.entrySet()) {

	                    if (entry.getValue() == maxValueInMap) {

	                        System.out.println("The Department having maximum no of Employees :" + entry.getKey());
	                    }
	                    if (entry.getValue() == min) {

	                        System.out.println("The Department having minimum no of Employees :" + entry.getKey());
	                    }

	                }
	                break;

	            case 2:
	                System.out.println("Enter Department");
	                String dep = scan.next();
	                I.stream().filter(e -> e.department.contains(dep)).map(e -> e.emp_name).forEach(System.out::println);

	                break;
	            case 3:

	                I.stream().map(j -> j.date_of_joining).collect(Collectors.toList());
	                I.stream().map(r -> r.date_of_resign).collect(Collectors.toList());
	                List<EmployeeQue17> ii = I.stream().sorted((e1, e2) -> e2.date_of_resign.compareTo(e1.date_of_joining))
	                        .collect(Collectors.toList());

	                List<EmployeeQue17> empdatediff = new ArrayList<>();
	                for (int i = 0; i <= I.size() - 1; i++) {
	                    String date1 = I.get(i).date_of_joining;

	                    String date2 = I.get(i).date_of_resign;

	                    SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy", Locale.ENGLISH);
	                    Date firstdate =  (Date) sdf.parse(date1);
	                    Date seconddate =  (Date) sdf.parse(date2);

	                    long diffInM = Math.abs(seconddate.getTime() - firstdate.getTime());
	                    long diff = TimeUnit.DAYS.convert(diffInM, TimeUnit.MILLISECONDS);
	                    System.out.println(I.get(i).emp_name + " has experience " + diff / 365);

	                }
	                break;

	            case 4:
	                System.out.println("Enter department");
	                String dep2 = scan.next();

	                Double y = I.stream().filter(e -> e.getDepartment().contains(dep2)).mapToDouble(val -> val.salary)
	                        .average().getAsDouble();
	                System.out.println("Average salary of Employee is : " + y);

	                break;
	            case 5:
	                System.out.println("Enter Deparment");
	                String depp4 = scan.next();
	                Double maximum = I.stream().filter(e -> e.department.contains(depp4)).mapToDouble(e -> e.getSalary())
	                        .max().getAsDouble();
	                System.out.println("maximum salary is " + maximum);

	                Double minimum = I.stream().filter(m -> m.department.contains(depp4)).mapToDouble(e -> e.getSalary())
	                        .min().getAsDouble();
	                System.out.println("Minimum salary is " + minimum);

	                ch = scan.nextInt();

	                if (ch == 5) {
	                    break;
	                }
	                break;
	            }

	        }
	    }
}
