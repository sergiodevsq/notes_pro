# 
#
#

# CONCATENAÇÃO
preco = 45.23
puts "O valor cobrado é #{preco}"
puts "O valor cobrado é " << preco.to_s

puts "\n"
# SUBSTRING
a = "O pequeno príncipe"
puts a[2, 2]
puts "\n"

# SPLIT
a = "frase para ser splitada"
puts a.split


puts "\n"
#REPLACE
puts "Carro".gsub('a', 'b')
puts "\n"


#CAPITALIZE
puts "exemplo capitalize".capitalize
puts "\n"

#UPCASE
puts "exemplo capitalize".upcase
puts "\n"

#DOWNCASE
puts "SEGUNDO EXEMPLO".downcase
puts "\n"

#DELETE

puts "Este preço esta errado".delete("Este")
puts "\n"

#STRIP semelhante a trim de outras linguagens
a = "  Ruby on Rails      "
puts a.length
puts a.strip!
puts a.length
puts "\n"














