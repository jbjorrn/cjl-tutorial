(ns training-day-test
  (:use iloveponies.tests.training-day)
  (:require [training-day :refer [square, answer, average]]
            [midje.sweet :refer :all])) nil

(square 2)

(facts "answer"
       (answer) => "42")

(facts "square"
       (square 2) => 4)

(facts "average"
       (average 2 4) = > 3)



