# Testando o conceito de classes abertas do ruby
#
class String
    def plural
        "#{self}s"
    end
end

puts "caneta".plural 