object DefaultArgs extends App{
  // if we are repeatedly calling a function with the same values for the parameters, we can set default values to the parameters


  def savePicture(format: String = "jpeg", width: Int = 1920, height : Int = 1080) : Unit = println("Saving the picture");

  //savePicture(12) doesn't work because it doesn't know what to assign 12 to
  //savePicture(height = 12) can be done as the name of the parameter is specified
  // this allows us to call parameters in different order




}
