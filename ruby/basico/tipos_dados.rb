# Todos os tipos são classes em Ruby
# Tudo em Ruby é objeto
# Ruby possui tipagem dinâmica
# Ruby é fortemente tipada
# A superclasse geral do Ruby é BasicObject
# Object herda de BasicObject

a   = "1"
a2  = 1
a3  = 1.3
puts a.class  # String  a.methods exibe todos os métodos para objeto  String
puts a2.class # Integer a2.methods exibe todos os métodos para objeto Integer 
puts a3.class # Float   a3.methods exibe todos os métodos para objeto Float

h = {}
puts "Stringy string McString!".class
puts 1.class
puts 1.class.superclass
puts 1.class.superclass.superclass
puts 4.3.class
puts 4.3.class.superclass
puts nil.class
puts h.class
puts :symbol.class
puts [].class
puts (1..8).class
