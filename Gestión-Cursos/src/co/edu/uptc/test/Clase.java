package co.edu.uptc.test;

public class Clase {
    
    private int promedioNotas;

    public Clase (){

    }

    public Clase(int promedioNotas) {
        this.promedioNotas = promedioNotas;
    }


    public void PromedioEstudiantes (int [] array){
        int suma=0;
        for(int i=0; i<array.length; i++){
            suma+=array[i];
        }
        promedioNotas= suma/array.length;
    }

    public int getPromedioNotas() {
        return promedioNotas;
    }

}
