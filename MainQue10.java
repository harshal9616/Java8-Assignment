package assignment;

import java.util.ArrayList;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.Set;

public class MainQue10 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<EmpQue10> I=new ArrayList<EmpQue10>();
		I.add(new EmpQue10("Rahul",1));
		I.add(new EmpQue10("Akshay",2));
		I.add(new EmpQue10("Omkar",3));
		I.add(new EmpQue10("Raj",4));



		Map<Integer,String> empMap=I.stream().collect(Collectors.toMap(e->e.getId(),e->e.getName()));
		System.out.println(empMap);

		Set<String> nameSet = I.stream().map(e->e.Name).collect(Collectors.toSet());

		System.out.println(nameSet);

		}

		}

