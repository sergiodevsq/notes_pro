# Para Float
puts "123.50" .to_f         # => 123.5
puts Float("123.50")        # => 123.5
puts "something".to_f       #=> 0.0
#puts Float("something")     # ArgumentError: invalid value for Float():

# Para String
puts 123.5.to_s               #=> "123.5"
puts String(123.5)         #=> "123.5"
sprintf("%s" , 123.5)         #=> "123.5"
puts "%s" % 123.5             #=> "123.5"
puts "%d" % 123.5             #=> "123"
puts "%.2f" % 123.5           #=> "123.50"

# Para Integer
puts "123.50".to_i      #=> 123
puts Integer("123.50")  #=> 123
puts "123-foo".to_i     # => 123
puts "foo-123".to_i     # => 0
puts "something".to_i   #=> 0
#Integer("something")   # ArgumentError: invalid value for Integer():




