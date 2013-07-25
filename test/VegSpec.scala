import org.specs2.mutable._

import play.api.test._
import play.api.test.Helpers._

import Veg._

/**
 * Add your spec here.
 * You can mock out a whole application including requests, plugins etc.
 * For more information, consult the wiki.
 */
class VegSpec extends Specification {
  
  "Vegetable" should {
    
    val plantingMonths = Months.May::Nil
    val plantingType = "type"
    val plantingDepth: Depth = 12
    val plantingDistance : Distance = (20,20)
    val planting : Planting = new Planting(plantingMonths, plantingType, plantingDepth,plantingDistance)
    val veg : Veg = new Veg("name","scientificname","Quenopodiacias",planting)
    

    "has a name and a scientific name" in {
      veg.name must_== "name"
      veg.scientificName  must_== "scientificname"
    }
    
    "has a family" in{
      veg.family must_== "Quenopodiacias"
    }

    "has solar exposure" in {
      pending
    }

    "has height" in{
      pending
    }

    "has irrigation needs " in {
      pending
    }

    "has irrigation frequency" in{
      pending
    }

    "may have favorables associations" in{
      pending
    }

    "may have unfavorable associations" in{
      pending
    }

    "has soil preferences" in{
      pending
    }

    "has manure preferences" in{
      pending
    }

    "has crop rotation years" in{
      pending
    }

    "has planting seasson" in{
      pending
    }

    "has planting type" in{
      planting.plantingType must_== plantingType
    }

    "has planting depth" in{
      planting.depth must_== plantingDepth
    }

    "has planting distance" in {
      planting.distance must_== plantingDistance
    }
  
  }
}