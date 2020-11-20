package org.company;

public class CompanyInfo {
	private void companyName(String name) {
		System.out.println("Company name:"+name);

	}
	private void companyName(String loc, String city) {
		System.out.println("Company locality:"+loc);
		System.out.println("Company City:"+city);

	}
	private void companyName(int id,String mail,long phone) {
		System.out.println("Company ID:"+id);
		System.out.println("Company mail:"+mail);
		System.out.println("COmpany Phone number:"+phone);

	}
	public static void main(String[] args) {
		
		CompanyInfo c=new CompanyInfo();
		c.companyName("MCS");
		c.companyName("OMR","Chennai");
		c.companyName(16789, "MCS@mcs.com", 9002456731l);
	}

}
