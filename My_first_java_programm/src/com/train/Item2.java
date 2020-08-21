package com.train;
//练习匿名类
public abstract class Item2 {
    String name;
    int price;
    public abstract void ItemName();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Item2 xueping= new Item2() {
		@Override
		public void ItemName() {
			// TODO Auto-generated method stub
			System.out.println("当前道具的名字是"+this.name);
		}
      };
      xueping.name="血瓶";
      xueping.ItemName();
      System.out.println(xueping);
	}

}
