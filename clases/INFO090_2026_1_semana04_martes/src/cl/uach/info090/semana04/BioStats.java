package cl.uach.info090.semana04;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class BioStats {
	private String fileName;
	private ArrayList<Person> population;
	
	public BioStats(String fileName) {
		this.fileName = fileName;
		this.population = new ArrayList<Person>();
		loadData();
	}
	
	public void loadData() {
		try {
		FileReader fr = new FileReader(fileName); //".data/biostat.csv"
		BufferedReader br = new BufferedReader(fr);
		
		String line = "";
		int i = 0;
		while(line = br.readLine()) != null){
			if(i>0) {
				//System.out.println(line);
				line = line.replaceAll("\"","");
				String[] partes = line.split(",");
				population.add(new Person(
						partes[0],
						partes[1].toUpperCase().charAt(0),
						Integer.parseInt(partes[2]),
						Double.parseDouble(partes[3]),
						Double.parseDouble(partes[4])
						));
			}
			i++;
		}
		
		br.close();
		fr.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void showData() {
		for(Person p: population) {
			System.out.println(p);
		}
	}
	
	public double heightAvg() {
		if(population == null || population.size()==0) return 0;
		double sumW = 0;
		
		for(Person p: population) {
			sumH += p.getHeight();
		}
		return sumH/population.size();
	}
	
	public double weightAvg() {
		if(population == null || population.size()==0) return 0;
		double sumW = 0;
		
		for(Person p: population) {
			sumW += p.getWeight();
		}
		return sumW/population.size();
	}
	
}
