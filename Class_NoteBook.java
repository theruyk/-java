package Homework;

public class Class_NoteBook {
private int ID;
private int RAM;
private int Memory;
String operating_system;
String color;


public Class_NoteBook(int ID,int RAM, int Memory,String operating_system,String color){
  this.RAM = RAM;
  this.Memory = Memory;
  this.operating_system = operating_system;
  this.color = color;
}
public int getId()
{
  return ID;
}

public int getRAM() {
  return RAM;
}

public String getColor() {
  return color;
}

public int getMemory() {
  return Memory;
}

public String getOperating_system() {
  return operating_system;
}

public String toString() {
  return  " \nОЗУ: " + RAM + 
          " \nОбъем ЖД: " + Memory +
          " \nОперационная система: " + operating_system + 
          " \nЦвет: " + color +"\n";
          
}

}