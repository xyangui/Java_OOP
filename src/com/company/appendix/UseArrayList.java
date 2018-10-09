package com.company.appendix;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class UseArrayList {
    public static void main(int arraySize) {

        String[] strArray1 = new String[arraySize]; //初始化时即确定数组大小

        String[] strArray2 = {"str1","str2","str3","str4"};
        //strArray2.add("str5");//无法动态增加元素


        /**基础*****************************************************/
        Student student1 = new Student("111", 111);
        Student student2 = new Student("222", 222);

        ArrayList<Student> stuArrayList = new ArrayList<Student>();

        //add
        stuArrayList.add(student1);
        stuArrayList.add(student1);
        stuArrayList.add(student1);

        student1.setGPA(123);// stuArrayList 里面三个元素全部改为 "123"

        stuArrayList.add(0, student2); //在数组最前面添加元素

        //get
        Student getStudent = stuArrayList.get(1);//参数从0开始，返回地址
        getStudent.setGPA(321);// stuArrayList 里后面三个元素全部改为 "321"

        //remove
        stuArrayList.remove(3);

        //set
        Student student3 = new Student("333",333);
        stuArrayList.set(2, student3);//替换

        //lastIndexOf
        int lastStudent1 = stuArrayList.lastIndexOf(student1);//返回指定元素最后出现的索引

        //size
        int sizeArray = stuArrayList.size();//两个元素，返回 2

        //遍历
        for(Student stude2 : stuArrayList){
            String str = stude2.getStudentID();
            System.out.println(str);
            //stuArrayList.remove(stude2);  //删除当前元素元素，后面就找不到了
        }


        /**高级*****************************************************/
        //Iterator
        Iterator<Student> iter = stuArrayList.iterator();
        while(iter.hasNext()){
            //Student stud1 = iter.next();
            System.out.println(iter.next().getStudentID());
            //iter.remove() ;	// 删除当前元素，iter.hasNext()后面就找不到了
        }

        //ListIterator
        ListIterator<Student> listIter = stuArrayList.listIterator() ;
        System.out.print("由前向后输出：") ;
        while(listIter.hasNext()){
           // Student stud1 = listIter.next() ;
            System.out.println(listIter.next().getStudentID() + "、") ;
        }

        System.out.print("由后向前输出：") ;
        while(listIter.hasPrevious()){
            //Student stud1 = listIter.previous() ;
            System.out.println(listIter.previous().getStudentID() + "、") ;
            //listIter.previous();
            //listIter.remove();//从后向前删除可以
        }

        //remove
        Student student4 = new Student("333",333);
        // Student 如果没有重写 equals 方法，只是比较每个元素的地址是否相同，如果有相同才删除
        // Student 重写 equals 方法后，按照其重写的 equals 方法比较，如果相等再删除
        boolean isSuccess = stuArrayList.remove(student4);

        //equals
        Student student21 = new Student("111",111);
        Student student22 = new Student("222",222);
        Student student23 = new Student("333",333);

        ArrayList<Student> stuArrayList2 = new ArrayList<Student>();
        stuArrayList2.add(student21);
        stuArrayList2.add(student22);
        stuArrayList2.add(student23);

        Student student31 = new Student("111",111);
        Student student32 = new Student("222",222);
        Student student33 = new Student("333",333);

        ArrayList<Student> stuArrayList3 = new ArrayList<Student>();
        stuArrayList3.add(student31);
        stuArrayList3.add(student32);
        stuArrayList3.add(student33);

        // Student 如果没有重写 equals 方法，只是比较每个元素的地址是否相同，都相同下面才返回 true
        // Student 重写 equals 方法后，按照其重写的 equals 方法比较
        boolean isEquals = stuArrayList2.equals(stuArrayList3);

    }
}
