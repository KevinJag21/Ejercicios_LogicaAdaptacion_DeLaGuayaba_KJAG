#Autor: Kevin Araya Granados
class Exercise3
  def initialize()
  end

  def showMax()
    myArray = [13,2,4,35,1]
    max = 0
    myArray.each do |i|
      if max < i
        max = i
      end
    end
    puts max
  end

end  
  
exercise3 = Exercise3.new()
exercise3.showMax
gets()