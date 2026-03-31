package cl.uach.info090;

import java.util.ArrayList;

public class EjemploArreglosYArrayList {

	public static void main(String[] args) {
		String[] arreglo = new String[3];
		arreglo[0] = "A";
		for(int i=0;i<arreglo.length;i++){
			System.out.println(arreglo[i]);
		}
		
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("Hola");
		arrayList.add("chao");
		arrayList.add("que tal!");
		arrayList.add("adios");
		arrayList.add(2,"BAKAN!");
		arrayList.set(0, "HOLA");
		System.out.println(arrayList);
		System.out.println(arrayList.get(arrayList.size()-1));

		for(int i=0;i<arrayList.size();i++){
			System.out.println(arrayList.get(i));
		}
		
		
		
		ArrayList<ArrayList<String>> arrayList2 = new ArrayList<ArrayList<String>>();
		
		ArrayList<Integer> vector = new ArrayList<Integer>();
		vector.add(10);
	}

}
