class FoodFactory
{
	public Food getFood(String order)
	{
		if(order==null)
			return null;
		else if(order.equalsIgnoreCase("Pizza"))
			return new Pizza();
		else if(order.equalsIgnoreCase("Cake"))
			return new Cake();
		else 
			return null;
	}
}