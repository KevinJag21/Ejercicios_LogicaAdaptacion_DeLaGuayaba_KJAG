#Autor: Kevin Araya Granados
class Exercise4
  def initialize()
  end

  def saluda()
    myArray = [1,2,1,3,3,1,2,1,5,1]
    max = 5
    number = 1
    while number <= max do

      counter = 0
      myArray.each do |i|
        if number == i
          counter += 1
        end
      end

      histograma = "*" *counter
      puts "#{number}: #{histograma}"
       
      number += 1
    end
    
  end

end  
  
exercise4 = Exercise4.new()
exercise4.saluda
gets()
