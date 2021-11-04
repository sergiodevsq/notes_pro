a = 1

# if simples
if a == 1 
    puts "Variável a igual a 1"
end

puts "Variável a igual a 1. 2" if a == 1

puts "\n"
# if else
a = 2
if a == 1 
    puts "igual a 1"
else
    puts "diferente de 1"
end

puts "\n"
a = 3
if a == 1
    puts "igual a 1"
elsif a == 3
    puts "igual a 3"
else  
    puts "outro valor"
end

puts "\n"
case a
    when 1
        puts "igual a 1"
    when 2
        puts "igual a 2"
    when 3
        puts "igual a 3"    
end

puts "\n"
unless a == 2
    puts "a não é igual a 2"
end

puts "\n Ternários \n"
z = a == 3 ? a : 0
puts z
puts "\n"
a = 1
z = a == 3 ? a : 0
puts z











