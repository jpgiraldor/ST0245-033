
/**
 * Write a description of class Date here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Date
{
    int day;
    int month;
    int year;
    String fecha;
    String fecha1;
    int dia;
    int mes;
    int año;
    Date(int day,int month,int year){
        this.day=day;
        this.month=month;
        this.year=year;
    } 
    public String toString(){
        fecha=""+ this.day+this.month+this.year;
        return ""+ this.day+this.month+this.year;
        
    }
    public void convert(int dia,int mes, int año){
        String day1=Integer.toString(dia);
        String month1=Integer.toString(mes);
        String year1=Integer.toString(año);
        fecha1=""+day1+month1+year1;
    }
    public boolean compare(int dia,int mes, int año){
        fecha=""+ this.day+this.month+this.year;
        String day1=Integer.toString(dia);
        String month1=Integer.toString(mes);
        String year1=Integer.toString(año);
        fecha1=""+day1+month1+year1;
        return fecha.equals(fecha1);
    }
    public int compareint(int dia,int mes, int año){
        //convert(dia,mes,año);
        Integer fecha2=dia+mes+año;
        Integer fecha3=day+month+year;
        return fecha3.compareTo(fecha2);
        
    }
}
