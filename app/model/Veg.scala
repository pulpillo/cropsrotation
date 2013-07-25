
object Veg{
	
	class Veg(val name:String, val scientificName:String, val family:String, val planting: Planting)

	type Depth = Int
	type Distance = (Int,Int)

	object Months extends Enumeration{
		type Months = Value
		val January, February, March, April, May, June, July, August, September, October, November, December = Value
	}

	import Months._

	class Planting(val seasons: List[Months], val plantingType:String, val depth: Depth, val distance: Distance)
}
