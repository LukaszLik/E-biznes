
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
class PaymentController @Inject()(cc: MessagesControllerComponents)(implicit ec: ExecutionContext) extends MessagesAbstractController(cc) {

  def getPayments: Action[AnyContent] = Action.async { implicit request =>
    Future {
      Ok("")
    }
  }

  def getPayment(id: Long): Action[AnyContent] = Action.async { implicit request =>
    Future{
      Ok("")
    }
  }

  def deletePayment(id: Long): Action[AnyContent] = Action.async {
    Future{
      Ok("")
    }
  }

  def updatePayment(id: Long): Action[AnyContent] = Action.async { implicit request: MessagesRequest[AnyContent] =>
    Future{
      Ok("")
    }
  }

  def updatePaymentHandle = Action.async {
    Future{
      Ok("updateProductHandle ok")
    }
  }


  def addPayment: Action[AnyContent] = Action.async {
    Future {
      Ok("addProduct ok")
    }
  }

  def addPaymentHandle = Action.async {
    Future{
      Ok("addProductHandle ok")
    }
  }

}

