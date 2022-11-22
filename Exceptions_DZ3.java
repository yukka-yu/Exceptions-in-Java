package home3;

import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Arrays;
import java.util.Scanner;

public class Exceptions_DZ3 {

        public static void main(String[] args) {
            int dataNum = 6;
            int max = 11;
            int min = 7;
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите через пробел фамилию, имя, отчество, пол, дату рождения и телефон:");
            String data = sc.nextLine();
            String [] dataArr = data.split(" ");
            if(isValidData(dataArr, dataNum, max, min)){
                    try (FileWriter fileWriter = new FileWriter(dataArr[0], true)) {
                        StringBuilder data2 = new StringBuilder();
                        for (String s : dataArr) {
                            data2.append("<").append(s).append(">");
                        }
                        data2.append("\n");
                        fileWriter.write(String.valueOf(data2));
                    } catch (IOException e) {
                        System.out.println(Arrays.toString(e.getStackTrace()));
                    }
            }
        }



    /**
     * Метод определяет, соответствует ли введённое количество данных требуемому, если нет - пробрасывает ошибку
     * @param dataArr массив введённых данных
     * @param dataNum необходимое кол-во данных
     * @return
     */
        public static void isValidDataLength(String [] dataArr, int dataNum) throws WrongDataLengthException{
            if(dataArr.length != dataNum){
                throw new WrongDataLengthException();
            }
        }

    /**
     * Метод определяет, верно ли введена дата. Обрабатывает ошибку, выдаёт сообщение
     * @param date  дата в строковом формате
     * @return  возвращает true или false
     */
    public static boolean isValidDate(String date){
            try{
                LocalDate.parse(date, DateTimeFormatter.ofPattern("dd.MM.yyyy"));
                return true;
            } catch (DateTimeParseException e) {
                System.out.println("�������� ������ ����");
                return false;
            }
    }

    /**
     * Метод определяет, верно ли введён номер телефона, если нет, пробрасывает ошибки
     * @param phoneNumber телефонный номер в строковом формате
     * @param maxPhoneNumberLength максимальная допустимая длина номера
     * @param minPhoneNumberLength минимально допустимая длина номера
     * @return
     */
    public static void isValidPhoneNumber(String phoneNumber, int maxPhoneNumberLength, int minPhoneNumberLength) throws WrongPhoneNumberLengthException {
        String regex = "[0-9]+";
        if(minPhoneNumberLength > phoneNumber.length() || phoneNumber.length() > maxPhoneNumberLength) {
            throw new WrongPhoneNumberLengthException();
        }
        else if (!phoneNumber.matches(regex)){
            throw new NumberFormatException("Номер телефона содержит недопустимые символы");
        }
    }

    /**
     * Метод проверяет, правильно ли введён пол, если нет, пробрасывает ошибку
     * @param sex пол в строковом формате
     * @return
     */
    public static void isValidSex(String sex) throws WrongSexException{
        if(!sex.equals("m") && !sex.equals("f")){
            throw new WrongSexException();
        }
    }

    /**
     * Метод проверяет правильность ввода всех данных
     * @param dataArr введённые данные в виде массива строк 
     * @param dataNum Требуемое число данных
     * @param maxPhoneNumberNum максимальная допустимая длина номера
     * @param minPhoneNumberNum минимально допустимая длина номера
     * @return возвращает true, если всё верно, иначе false и сообщения об ошибках
     */
    public static boolean isValidData(String [] dataArr, int dataNum, int maxPhoneNumberNum, int minPhoneNumberNum){
        boolean flag;
        try{
            isValidDataLength(dataArr, dataNum);
            try{
                isValidSex(dataArr[3]);
            } catch (WrongSexException e){
                System.out.println(e.getMessage());
                flag = false;
            }
            if(!isValidDate(dataArr[4])) return false;
            try {
                isValidPhoneNumber(dataArr[5], maxPhoneNumberNum, minPhoneNumberNum);
            } catch (WrongPhoneNumberLengthException | NumberFormatException e){
                System.out.println(e.getMessage());
                flag = false;
            }

        } catch (WrongDataLengthException e){
            System.out.println(e.getMessage());
            flag = false;
        }
        flag = true;
        return flag;
    }

}


