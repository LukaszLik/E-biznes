package controllers

import javax.inject._
import play.api.mvc._
import scala.concurrent.{ExecutionContext, Future}
import scala.util.{Failure, Success}
/**
 * This controller creates an `Action` to handle HTTP requests to the
 * application's home page.
 */
@Singleton
class RecordInCartController @Inject()(cc: MessagesControllerComponents)(implicit ec: ExecutionContext) extends MessagesAbstractController(cc) {

  def getRecordsInCart: Action[AnyContent] = Action.async { implicit request =>
    Future {
      Ok("")
    }
  }

  def getRecordInCart(id: Long): Action[AnyContent] = Action.async { implicit request =>
    Future {
      Ok("")
    }
  }

  def deleteRecordInCart(id: Long): Action[AnyContent] = Action.async {
    Future {
      Ok("")
    }
  }

  def updateRecordInCart(id: Long): Action[AnyContent] = Action.async { implicit request: MessagesRequest[AnyContent] =>
    Future {
      Ok("")
    }
  }

  def updateRecordInCartHandle = Action.async {
    Future {
      Ok("updateProductHandle ok")
    }
  }


  def addRecordInCart: Action[AnyContent] = Action.async {
    Future {
      Ok("addProduct ok")
    }
  }

  def addRecordInCartHandle = Action.async {
    Future {
      Ok("addProductHandle ok")
    }
  }
}
