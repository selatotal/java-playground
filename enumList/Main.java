public class Main {
    

    public static void main(String[] args) {
        
        StatusEnum status = StatusEnum.OPEN;
        StatusEnum newStatus = StatusEnum.CANCELED;

        if (status.nextStatus().contains(newStatus)){
            System.out.println("Próximo Status Válido");
        } else {
            System.out.println("Próximo Status Invalido");
        }

    }
}
