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
    
    "has a name and a scientific name" in {
      val veg : Veg = new Veg("name","scientificname")
      veg.name must startWith("name")
      veg.scientificName must startWith("scientificname")
    }
    
    
  }
}