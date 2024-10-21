package houserent.service;

import houserent.domain.House;

/**
 * @author: Sean
 * @date: 2024/10/21
 * @project: HomeWork
 */
public class HouseService {
    // 定义数组，存放的House对象
    private House[] houses;
    private int houseNum = 0; // 记录当前有多少房源
    private int idCounter = 0; // 记录当前id增长到的值

    public HouseService(int size) {
        houses = new House[size];
        // 初始化定义一个房源信息，测试使用
//        houses[0] = new House(1, "jack", "123", "北京", 5000, "未出租");
    }

    public House[] list() {
        return houses;
    }

    public boolean add(House newHouse) {
        // 判断是否还可以继续添加（暂时忽略扩容问题）
        if (houseNum == houses.length) {
            System.out.println("数组已满，无法添加");
            return false;
        }
        // 在当前数组中，下标为houseNum的位置，添加newHouse，之后houseNum自增1
        houses[houseNum++] = newHouse;
        // id 自增
        newHouse.setId(++idCounter);
        return true;
    }

    public boolean del(int delId) {
        // 根据id找到要删除的房源信息对应的数组下标
        int index = -1;
        for (int i = 0; i < houseNum; i++) {
            if (delId == houses[i].getId()) {
                // 要删除的房屋（是数组下标为i的元素）
                index = i;
            }
        }
        if (index == -1) {
            return false;
        }
        // 如果找到了要删除的房屋，则将后面的房屋前移，覆盖要删除的房屋
        for (int i = index; i < houseNum - 1; i++) {
            houses[i] = houses[i + 1];
        }
        // 删除后，最后一个元素置为null
        houses[--houseNum] = null;
        return true;
    }

    public House findById(int targetId) {
        int index = -1;
        // 遍历数组
        for (int i = 0; i < houseNum; i++) {
            if (targetId == houses[i].getId()) {
                return houses[i];
            }
        }
        return null;
    }
}
