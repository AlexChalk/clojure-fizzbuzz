# Clojure Fizzbuzz

An implementation of fizzbuzz in Clojure

## Installation

Clone the repository: `git clone git@github.com:adc17/clojure-fizzbuzz.git`

## Usage

This guide assumes you have clojure and leiningen installed. 

Tests can be run with the following:
```
lein repl
(require '[clojure.test :refer [run-tests]])
(require 'clojure-fizzbuzz.core-test)
(run-tests 'clojure-fizzbuzz.core-test)
```

You can also interact with the code from the repl:
```
clojure-fizzbuzz.core=> (require 'clojure-fizzbuzz.core)
> nil
clojure-fizzbuzz.core=> (fizzbuzz 1)
> 1
clojure-fizzbuzz.core=> (fizzbuzz 3)
> "fizz"
clojure-fizzbuzz.core=> (fizzbuzz 15)
> "Fizzbuzz"
clojure-fizzbuzz.core=> (fizzbuzz_loop)
> (1
 2
 "fizz"
 4
 "buzz"
 etc.
```

## Other notes

My first Clojure project!