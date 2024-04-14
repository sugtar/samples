require 'find'

Find.find('../') {|filename|
    if /\.rb$/ =~ filename
        puts filename
    end
}