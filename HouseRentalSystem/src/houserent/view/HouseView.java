package houserent.view;

import houserent.domain.House;
import houserent.service.HouseService;
import houserent.utils.Utility;

import javax.rmi.CORBA.Util;

/**
 * @author: Sean
 * @date: 2024/10/21
 * @project: HomeWork
 * @description: 1. 显示界面 2. 接受用户输入 3. 调用HouseService完成对房屋信息的操作
 */
public class HouseView {
    private boolean loop = true; // 循环控制标识
    private char key = ' '; // 存储用户输入
    private HouseService houseService = new HouseService(2);


    // 显示主菜单
    public void mainMenu() {
        do {
            System.out.println("\n-----------------房屋出租系统----------------");
            System.out.println("\t\t\t1 新 增 房 源");
            System.out.println("\t\t\t2 查 找 房 源");
            System.out.println("\t\t\t3 删 除 房 源");
            System.out.println("\t\t\t4 修 改 房 源");
            System.out.println("\t\t\t5 房 屋 列 表");
            System.out.println("\t\t\t6 退       出");
            System.out.println("请输入你的选择(1-6): ");
            key = Utility.readChar();
            switch (key) {
                case '1':
                    addHouse();
                    break;
                case '2':
                    findHouse();
                    break;
                case '3':
                    delHouse();
                    break;
                case '4':
                    updateHouse();
                    break;
                case '5':
                    listHouse();
                    break;
                case '6':
                    exit();
                    break;
            }
        } while (loop);
    }

    public void listHouse() {
        // 房屋列表显示
        System.out.println("-----------------房屋列表-------------------");
        System.out.println("编号\t\t房主\t\t电话\t\t地址\t\t月租\t\t状态(未出租/已出租)");
        House[] houses = houseService.list(); // 获取所有房屋信息
        for (int i = 0; i < houses.length; i++) {
            // 遍历输出房屋信息
            if (houses[i] == null) {
                break;
            }
            System.out.println(houses[i]);
        }
        System.out.println("-----------------房屋列表展示完毕-------------------");
    }

    // 编写addHouse()接收输入，创建House对象，调用add方法
    public void addHouse() {
        System.out.println("=============添加房源============");
        System.out.println("姓名：");
        String name = Utility.readString(8);
        System.out.println("电话：");
        String phone = Utility.readString(11);
        System.out.println("地址：");
        String address = Utility.readString(16);
        System.out.println("月租：");
        int rent = Utility.readInt();
        System.out.println("状态：");
        String state = Utility.readString(3);
        // 创建一个House对象，但是注意id要系统自动分配，不需要手动维护，暂时初始化为0，测试用
        House newHouse = new House(0, name, phone, address, rent, state);
        if(houseService.add(newHouse)) {
            System.out.println("==============添加房屋成功=================");
        } else {
            System.out.println("==============添加房屋失败=================");
        }
    }

    // 编写delHouse()接收输入的房源id，调用HouseService的删除方法完成对房源信息的删除
    public void delHouse() {
        System.out.println("=============删除房源===========");
        System.out.println("请输入要删除的房源id(-1取消)：");
        int delId = Utility.readInt();
        if (delId == -1) {
            System.out.println("=========取消删除=======");
            return;
        }
        char choice = Utility.readConfirmSelection();
        if (choice == 'Y') {
            if(houseService.del(delId)) {
                System.out.println("=========删除成功=======");
            }else {
                System.out.println("=========房源Id不存在，删除失败=======");
            }
        }else {
            System.out.println("=========取消删除=======");
        }
    }

    // 优化退出，加上确认逻辑
    public void exit() {
        if (Utility.readConfirmSelection() == 'Y') {
            System.out.println("退出...");
            loop = false;
        }
    }

    // 编写findHouse()接收输入的房源id，调用HouseService的查找方法完成查找
    public void findHouse() {
        System.out.println("=========查找房屋信息=============");
        System.out.println("请输入要查找的房源id：");
        int findId = Utility.readInt();
        if (houseService.findById(findId) != null) {
            System.out.println(houseService.findById(findId));
        } else {
            System.out.println("=========没有找到该房源===========");
        }
    }

    // 根据id修改房屋信息
    public void updateHouse() {
        System.out.println("=============修改房屋信息============");
        System.out.println("请输入要修改的房源id(-1取消)：");
        int updateId = Utility.readInt();
        if (updateId == -1) {
            System.out.println("=========取消修改=======");
            return;
        }
        // 根据输入的id查找对象
        House updateHouse = houseService.findById(updateId);
        if (updateHouse == null) {
            System.out.println("=========没有找到该房源，无法修改===========");
            return;
        }
        System.out.print("姓名(" + updateHouse.getName() + "): ");
        String name = Utility.readString(8, updateHouse.getName()); // 如果直接回车，表示不修改该信息，默认为原来的值
        if (!"".equals(name)) {
            // 如果输入了新值，则修改
            updateHouse.setName(name);
        }
        System.out.print("电话(" + updateHouse.getPhone() + "): ");
        String phone = Utility.readString(11, updateHouse.getPhone());
        if (!"".equals(phone)) {
            updateHouse.setPhone(phone);
        }
        System.out.print("地址(" + updateHouse.getAddress() + "): ");
        String address = Utility.readString(16, updateHouse.getAddress());
        if (!"".equals(address)) {
            updateHouse.setAddress(address);
        }
        System.out.print("月租(" + updateHouse.getRent() + "): ");
        int rent = Utility.readInt(updateHouse.getRent());
        if (rent != -1) {
            updateHouse.setRent(rent);
        }
        System.out.print("状态(" + updateHouse.getState() + "): ");
        String state = Utility.readString(3, updateHouse.getState());
        if (!"".equals(state)) {
            updateHouse.setState(state);
        }
    }


}
