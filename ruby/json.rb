require 'json'

json_data = JSON.parse('{"foo": "bar", "baz": 1}')

puts "#{json_data} (#{json_data.class})"

File.open("sample.json") {|f|
    json_data = JSON.load(f)
    puts "#{json_data} (#{json_data.class})"
}