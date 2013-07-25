import org.specs2.mutable._

import play.api.test._
import play.api.test.Helpers._

/**
 * Add your spec here.
 * You can mock out a whole application including requests, plugins etc.
 * For more information, consult the wiki.
 */
class VegSpec extends Specification {
  
  "Vegetable" should {
    
    val veg : Veg = new Veg("name","scientificname","Quenopodiacias")

    "has a name and a scientific name" in {
      veg.name must startWith("name")
      veg.scientificName must startWith("scientificname")
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

    "has planting time" in{
      pending
    }

    "has planting type" in{
      pending
    }

    "has planting depth" in{
      pending
    }

    "has planting distance" in {
      pending
    }
  
  }
}