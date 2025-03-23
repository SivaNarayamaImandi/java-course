package com;

public class Marker {
	String brand;
	int cost;
	String color;
	public Marker(String brand,int cost,String color)
	{
		this.brand=brand;
		this.color=color;
		this.cost=cost;
	}
	public void display()
	{
		System.out.println(brand);
		System.out.println(cost);
		System.out.println(color);
	}
	@Override
	public int hashCode()
	{
		return cost;
	}
	@Override
	public String toString()
	{
		return brand+" "+color;
	}
	@Override
	public boolean equals(Object o)
	{
		Marker marker1=(Marker)o;
		return this.color.equals(marker1.color);
	}
	public static void main(String[] args) {
		Marker marker=new Marker("Cello", 50, "red");
		Marker marker1=new Marker("Reynolds", 50, "Black");
		
		boolean b = marker.equals(marker1);
		System.out.println(b);
		
		String string = marker.toString();
		System.out.println(string);
		
		int i = marker.hashCode();
		int j = marker1.hashCode();
		System.out.println(i);
		System.out.println(j);
	}
}
