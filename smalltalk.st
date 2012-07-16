!Integer methods !

fibonacci
	self <= 1 ifTrue: [ ^1 ].
	^(self - 1) fibonacci + (self - 2) fibonacci.
! !


!Test methods !

testFibonacci
	| result duration |
	duration := Time microsecondsToRun: [ result := 40 fibonacci ].
	Transcript show: result asString; cr.
	Transcript show: duration asString; cr.
! !
