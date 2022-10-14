(1..100).each do |a|
  if a%15==0
    puts "run"
  elsif a%5==0
    puts "runs"
  elsif a%3==0
    puts "running"
  else 
    puts a
  end
end