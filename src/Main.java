public class Main {
    public static void main(String[] args){

        // Ejemplo de if
        int golpes = 1;
        if(golpes == 1){
            for (int i= 1; i <= 5; i++){
                System.out.println("Hurra!!");
            }
        }
        System.out.println();

        // Importancia de las llaves en los if anidados
        int score = 201;
        if(score > 200)
            if(score < 400)
                if(score > 300)
                    System.out.println(1);
                else
                    System.out.println(2);
        else
            System.out.println(3);

        if(score > 200){
            if(score < 400){
                if(score > 300){
                    System.out.println(1);
                }else{
                    System.out.println(2);
                }
            }else{
                System.out.println(3);
            }
        }
        System.out.println();

        // Evaluación del Saludo de acuerdo al horario en el Día.
        String tiempoDelDia = "Mañana";

        if(tiempoDelDia.equals("Mañana")){
            System.out.println("Buenos días!");
        }else if (tiempoDelDia.equals("Tarde")){
            System.out.println("Buenas tardes!");
        }else if (tiempoDelDia.equals("Noche")){
            System.out.println("Buenas noches!");
        }else{
            System.out.println("Que la pases bien hoy!");
        }
        System.out.println();

        // Switch
        String day = "SUN";
        switch (day){
            case "MON":
            case "TUE":
            case "WED":
            case "THU":
                System.out.println("Time to work");
                break;
            case "FRI":
                System.out.println("Nearing weekend");
                break;
            case "SAT":
            case "SUN":
                System.out.println("Weekend!");
                break;
            default:
                System.out.println("Invalid day?");
        }
        System.out.println();

        int dia = 1; //Lunes
        switch (dia){
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
        }

        String [] semana = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};
        System.out.println(semana[dia - 1]);
        System.out.println();

        score = 10;
        int num = 20;
        switch (score+num){
            case 30:
                System.out.println("El valor es 30");
                break;
        }
        System.out.println();

        score = 50;
        String result;
        switch (score){
            case 100: result = "A";
            case 50 : result = "B";
            case 10 : result = "C";
            default : result = "F";
        }
        System.out.println(result);

        switch (score){
            case 100: result = "A";
                    break;
            case 50 : result = "B";
                    break;
            case 10 : result = "C";
                    break;
            default : result = "F";
        }
        System.out.println(result);
    }
}
