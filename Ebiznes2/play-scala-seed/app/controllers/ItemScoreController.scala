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
class ItemScoreController @Inject()(cc: MessagesControllerComponents)(implicit ec: ExecutionContext) extends MessagesAbstractController(cc) {

  def getItemScores: Action[AnyContent] = Action.async { implicit request =>
    Future {
      Ok("")
    }
  }

  def getItemScore(id: Long): Action[AnyContent] = Action.async { implicit request =>
    Future {
      Ok("")
    }
  }

  def deleteItemScore(id: Long): Action[AnyContent] = Action.async {
    Future {
      Ok("")
    }
  }

  def updateItemScore(id: Long): Action[AnyContent] = Action.async { implicit request: MessagesRequest[AnyContent] =>
    Future {
      Ok("")
    }
  }

  def updatePaymentHandle = Action.async {
    Future {
      Ok("updateProductHandle ok")
    }
  }


  def addItemScore: Action[AnyContent] = Action.async {
    Future {
      Ok("addProduct ok")
    }
  }

  def addItemScoreHandle = Action.async {
    Future {
      Ok("addProductHandle ok")
    }
  }
}
