package storage;

import model.Employee;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeeFromFileBinary implements IEmployeeData{
    @Override
    public ArrayList<Employee> readFile() {
        File file= new File("List Employee1.hieu");
        try {
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);
            Object result = ois.readObject();
            ArrayList<Employee> employeeList=(ArrayList<Employee>) result;
            ois.close();
            fis.close();
            return  employeeList;
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return new ArrayList<>();
    }

    @Override
    public void writeFile(ArrayList<Employee> arrayList) throws IOException {
        ObjectOutputStream oos = null;
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("List Employee1.hieu");
            oos = new ObjectOutputStream(fos);
            oos.writeObject(arrayList);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            fos.close();
            oos.close();
        }
    }
}
