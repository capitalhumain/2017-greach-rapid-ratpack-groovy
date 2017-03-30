@Grab('io.ratpack:ratpack-groovy:1.4.5')

import static ratpack.groovy.Groovy.ratpack
import ratpack.http.MutableHeaders

ratpack {
  handlers {
    all { // <1>
      MutableHeaders headers = response.headers
      headers.set('Access-Control-Allow-Origin', '*')
      headers.set('Access-Control-Allow-Headers', 'x-requested-with, origin, content-type, accept')
      next() //<2>
    }
    get {
      render 'Hola Greach 2017!'
    }
  }
}
