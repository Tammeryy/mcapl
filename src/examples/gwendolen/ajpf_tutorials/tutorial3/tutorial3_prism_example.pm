dtmc

 module jpfModel
state : [0 ..193] init 0;
bag1holdblock: bool init true;
[] state = 0 -> 0.25:(state'=1) & (bag1holdblock'= true) + 0.25:(state'=83) & (bag1holdblock'= true);
[] state = 1 -> 0.25:(state'=48) & (bag1holdblock'= true) + 0.25:(state'=2) & (bag1holdblock'= true);
[] state = 2 -> 0.5:(state'=3) & (bag1holdblock'= true) + 0.5:(state'=29) & (bag1holdblock'= true);
[] state = 3 -> 0.5:(state'=17) & (bag1holdblock'= true) + 0.5:(state'=4) & (bag1holdblock'= true);
[] state = 4 -> 0.25:(state'=5) & (bag1holdblock'= true) + 0.25:(state'=12) & (bag1holdblock'= true);
[] state = 5 -> 0.5:(state'=6) & (bag1holdblock'= true);
[] state = 6 -> 0.3333333333333333:(state'=7) & (bag1holdblock'= true) + 0.3333333333333333:(state'=10) & (bag1holdblock'= false);
[] state = 7 -> 0.5:(state'=8) & (bag1holdblock'= false);
[] state = 8 -> 1.0:(state'=193) & (bag1holdblock'= false);
[] state = 10 -> 1.0:(state'=11) & (bag1holdblock'= false);
[] state = 11 -> 1.0:(state'=192) & (bag1holdblock'= false);
[] state = 12 -> 0.25:(state'=13) & (bag1holdblock'= true) + 0.25:(state'=15) & (bag1holdblock'= false);
[] state = 13 -> 0.5:(state'=14) & (bag1holdblock'= false);
[] state = 14 -> 1.0:(state'=191) & (bag1holdblock'= false);
[] state = 15 -> 0.5:(state'=16) & (bag1holdblock'= false);
[] state = 16 -> 1.0:(state'=190) & (bag1holdblock'= false);
[] state = 17 -> 0.25:(state'=18) & (bag1holdblock'= true) + 0.25:(state'=24) & (bag1holdblock'= true);
[] state = 18 -> 0.5:(state'=19) & (bag1holdblock'= true);
[] state = 19 -> 0.3333333333333333:(state'=20) & (bag1holdblock'= true) + 0.3333333333333333:(state'=22) & (bag1holdblock'= false);
[] state = 20 -> 0.5:(state'=21) & (bag1holdblock'= false);
[] state = 21 -> 1.0:(state'=189) & (bag1holdblock'= false);
[] state = 22 -> 1.0:(state'=23) & (bag1holdblock'= false);
[] state = 23 -> 1.0:(state'=188) & (bag1holdblock'= false);
[] state = 24 -> 0.25:(state'=25) & (bag1holdblock'= true) + 0.25:(state'=27) & (bag1holdblock'= false);
[] state = 25 -> 0.5:(state'=26) & (bag1holdblock'= false);
[] state = 26 -> 1.0:(state'=187) & (bag1holdblock'= false);
[] state = 27 -> 0.5:(state'=28) & (bag1holdblock'= false);
[] state = 28 -> 1.0:(state'=186) & (bag1holdblock'= false);
[] state = 29 -> 0.5:(state'=42) & (bag1holdblock'= true) + 0.5:(state'=30) & (bag1holdblock'= true);
[] state = 30 -> 0.25:(state'=37) & (bag1holdblock'= true) + 0.25:(state'=31) & (bag1holdblock'= true);
[] state = 31 -> 0.5:(state'=32) & (bag1holdblock'= true);
[] state = 32 -> 0.3333333333333333:(state'=33) & (bag1holdblock'= true) + 0.3333333333333333:(state'=35) & (bag1holdblock'= false);
[] state = 33 -> 0.5:(state'=34) & (bag1holdblock'= false);
[] state = 34 -> 1.0:(state'=185) & (bag1holdblock'= false);
[] state = 35 -> 1.0:(state'=36) & (bag1holdblock'= false);
[] state = 36 -> 1.0:(state'=184) & (bag1holdblock'= false);
[] state = 37 -> 0.25:(state'=38) & (bag1holdblock'= true) + 0.25:(state'=40) & (bag1holdblock'= false);
[] state = 38 -> 0.5:(state'=39) & (bag1holdblock'= false);
[] state = 39 -> 1.0:(state'=183) & (bag1holdblock'= false);
[] state = 40 -> 0.5:(state'=41) & (bag1holdblock'= false);
[] state = 41 -> 1.0:(state'=182) & (bag1holdblock'= false);
[] state = 42 -> 0.5:(state'=43) & (bag1holdblock'= true);
[] state = 43 -> 0.3333333333333333:(state'=44) & (bag1holdblock'= true) + 0.3333333333333333:(state'=46) & (bag1holdblock'= false);
[] state = 44 -> 0.5:(state'=45) & (bag1holdblock'= false);
[] state = 45 -> 1.0:(state'=181) & (bag1holdblock'= false);
[] state = 46 -> 1.0:(state'=47) & (bag1holdblock'= false);
[] state = 47 -> 1.0:(state'=180) & (bag1holdblock'= false);
[] state = 48 -> 0.25:(state'=49) & (bag1holdblock'= true) + 0.25:(state'=63) & (bag1holdblock'= false);
[] state = 49 -> 0.5:(state'=50) & (bag1holdblock'= true) + 0.5:(state'=57) & (bag1holdblock'= true);
[] state = 50 -> 0.5:(state'=51) & (bag1holdblock'= true) + 0.5:(state'=54) & (bag1holdblock'= true);
[] state = 51 -> 0.25:(state'=52) & (bag1holdblock'= true) + 0.25:(state'=53) & (bag1holdblock'= false);
[] state = 52 -> 0.5:(state'=14) & (bag1holdblock'= false);
[] state = 53 -> 0.5:(state'=16) & (bag1holdblock'= false);
[] state = 54 -> 0.25:(state'=55) & (bag1holdblock'= true) + 0.25:(state'=56) & (bag1holdblock'= false);
[] state = 55 -> 0.5:(state'=26) & (bag1holdblock'= false);
[] state = 56 -> 0.5:(state'=28) & (bag1holdblock'= false);
[] state = 57 -> 0.5:(state'=58) & (bag1holdblock'= true) + 0.5:(state'=61) & (bag1holdblock'= true);
[] state = 58 -> 0.25:(state'=59) & (bag1holdblock'= true) + 0.25:(state'=60) & (bag1holdblock'= false);
[] state = 59 -> 0.5:(state'=39) & (bag1holdblock'= false);
[] state = 60 -> 0.5:(state'=41) & (bag1holdblock'= false);
[] state = 61 -> 0.5:(state'=62) & (bag1holdblock'= false);
[] state = 62 -> 1.0:(state'=179) & (bag1holdblock'= false);
[] state = 63 -> 0.5:(state'=64) & (bag1holdblock'= false);
[] state = 64 -> 0.5:(state'=65) & (bag1holdblock'= false) + 0.5:(state'=76) & (bag1holdblock'= false);
[] state = 65 -> 0.5:(state'=66) & (bag1holdblock'= false) + 0.5:(state'=71) & (bag1holdblock'= false);
[] state = 66 -> 0.3333333333333333:(state'=67) & (bag1holdblock'= false) + 0.3333333333333333:(state'=69) & (bag1holdblock'= false);
[] state = 67 -> 1.0:(state'=68) & (bag1holdblock'= false);
[] state = 68 -> 1.0:(state'=178) & (bag1holdblock'= false);
[] state = 69 -> 0.5:(state'=70) & (bag1holdblock'= false);
[] state = 70 -> 1.0:(state'=177) & (bag1holdblock'= false);
[] state = 71 -> 0.3333333333333333:(state'=72) & (bag1holdblock'= false) + 0.3333333333333333:(state'=74) & (bag1holdblock'= false);
[] state = 72 -> 1.0:(state'=73) & (bag1holdblock'= false);
[] state = 73 -> 1.0:(state'=176) & (bag1holdblock'= false);
[] state = 74 -> 0.5:(state'=75) & (bag1holdblock'= false);
[] state = 75 -> 1.0:(state'=175) & (bag1holdblock'= false);
[] state = 76 -> 0.5:(state'=82) & (bag1holdblock'= false) + 0.5:(state'=77) & (bag1holdblock'= false);
[] state = 77 -> 0.3333333333333333:(state'=80) & (bag1holdblock'= false) + 0.3333333333333333:(state'=78) & (bag1holdblock'= false);
[] state = 78 -> 1.0:(state'=79) & (bag1holdblock'= false);
[] state = 79 -> 1.0:(state'=174) & (bag1holdblock'= false);
[] state = 80 -> 0.5:(state'=81) & (bag1holdblock'= false);
[] state = 81 -> 1.0:(state'=173) & (bag1holdblock'= false);
[] state = 82 -> 1.0:(state'=172) & (bag1holdblock'= false);
[] state = 83 -> 0.25:(state'=84) & (bag1holdblock'= true) + 0.25:(state'=143) & (bag1holdblock'= false);
[] state = 84 -> 0.25:(state'=85) & (bag1holdblock'= true) + 0.25:(state'=126) & (bag1holdblock'= false);
[] state = 85 -> 0.25:(state'=86) & (bag1holdblock'= true) + 0.25:(state'=106) & (bag1holdblock'= false);
[] state = 86 -> 0.5:(state'=98) & (bag1holdblock'= true) + 0.5:(state'=87) & (bag1holdblock'= true);
[] state = 87 -> 0.5:(state'=88) & (bag1holdblock'= true) + 0.5:(state'=93) & (bag1holdblock'= true);
[] state = 88 -> 0.25:(state'=89) & (bag1holdblock'= true) + 0.25:(state'=91) & (bag1holdblock'= false);
[] state = 89 -> 0.5:(state'=90) & (bag1holdblock'= false);
[] state = 90 -> 1.0:(state'=171) & (bag1holdblock'= false);
[] state = 91 -> 0.5:(state'=92) & (bag1holdblock'= false);
[] state = 92 -> 1.0:(state'=170) & (bag1holdblock'= false);
[] state = 93 -> 0.25:(state'=96) & (bag1holdblock'= false) + 0.25:(state'=94) & (bag1holdblock'= true);
[] state = 94 -> 0.5:(state'=95) & (bag1holdblock'= false);
[] state = 95 -> 1.0:(state'=169) & (bag1holdblock'= false);
[] state = 96 -> 0.5:(state'=97) & (bag1holdblock'= false);
[] state = 97 -> 1.0:(state'=168) & (bag1holdblock'= false);
[] state = 98 -> 0.5:(state'=99) & (bag1holdblock'= true) + 0.5:(state'=104) & (bag1holdblock'= true);
[] state = 99 -> 0.25:(state'=100) & (bag1holdblock'= true) + 0.25:(state'=102) & (bag1holdblock'= false);
[] state = 100 -> 0.5:(state'=101) & (bag1holdblock'= false);
[] state = 101 -> 1.0:(state'=167) & (bag1holdblock'= false);
[] state = 102 -> 0.5:(state'=103) & (bag1holdblock'= false);
[] state = 103 -> 1.0:(state'=166) & (bag1holdblock'= false);
[] state = 104 -> 0.5:(state'=105) & (bag1holdblock'= false);
[] state = 105 -> 1.0:(state'=165) & (bag1holdblock'= false);
[] state = 106 -> 0.5:(state'=107) & (bag1holdblock'= false);
[] state = 107 -> 0.5:(state'=119) & (bag1holdblock'= false) + 0.5:(state'=108) & (bag1holdblock'= false);
[] state = 108 -> 0.5:(state'=114) & (bag1holdblock'= false) + 0.5:(state'=109) & (bag1holdblock'= false);
[] state = 109 -> 0.3333333333333333:(state'=112) & (bag1holdblock'= false) + 0.3333333333333333:(state'=110) & (bag1holdblock'= false);
[] state = 110 -> 1.0:(state'=111) & (bag1holdblock'= false);
[] state = 111 -> 1.0:(state'=164) & (bag1holdblock'= false);
[] state = 112 -> 0.5:(state'=113) & (bag1holdblock'= false);
[] state = 113 -> 1.0:(state'=163) & (bag1holdblock'= false);
[] state = 114 -> 0.3333333333333333:(state'=115) & (bag1holdblock'= false) + 0.3333333333333333:(state'=117) & (bag1holdblock'= false);
[] state = 115 -> 1.0:(state'=116) & (bag1holdblock'= false);
[] state = 116 -> 1.0:(state'=162) & (bag1holdblock'= false);
[] state = 117 -> 0.5:(state'=118) & (bag1holdblock'= false);
[] state = 118 -> 1.0:(state'=161) & (bag1holdblock'= false);
[] state = 119 -> 0.5:(state'=120) & (bag1holdblock'= false) + 0.5:(state'=125) & (bag1holdblock'= false);
[] state = 120 -> 0.3333333333333333:(state'=121) & (bag1holdblock'= false) + 0.3333333333333333:(state'=123) & (bag1holdblock'= false);
[] state = 121 -> 1.0:(state'=122) & (bag1holdblock'= false);
[] state = 122 -> 1.0:(state'=160) & (bag1holdblock'= false);
[] state = 123 -> 0.5:(state'=124) & (bag1holdblock'= false);
[] state = 124 -> 1.0:(state'=159) & (bag1holdblock'= false);
[] state = 125 -> 1.0:(state'=158) & (bag1holdblock'= false);
[] state = 126 -> 0.5:(state'=127) & (bag1holdblock'= false);
[] state = 127 -> 0.3333333333333333:(state'=128) & (bag1holdblock'= false) + 0.3333333333333333:(state'=139) & (bag1holdblock'= false);
[] state = 128 -> 0.5:(state'=129) & (bag1holdblock'= false) + 0.5:(state'=134) & (bag1holdblock'= false);
[] state = 129 -> 0.5:(state'=130) & (bag1holdblock'= false) + 0.5:(state'=132) & (bag1holdblock'= false);
[] state = 130 -> 0.3333333333333333:(state'=112) & (bag1holdblock'= false) + 0.3333333333333333:(state'=131) & (bag1holdblock'= false);
[] state = 131 -> 1.0:(state'=111) & (bag1holdblock'= false);
[] state = 132 -> 0.3333333333333333:(state'=133) & (bag1holdblock'= false) + 0.3333333333333333:(state'=117) & (bag1holdblock'= false);
[] state = 133 -> 1.0:(state'=116) & (bag1holdblock'= false);
[] state = 134 -> 0.5:(state'=135) & (bag1holdblock'= false) + 0.5:(state'=137) & (bag1holdblock'= false);
[] state = 135 -> 0.3333333333333333:(state'=136) & (bag1holdblock'= false) + 0.3333333333333333:(state'=123) & (bag1holdblock'= false);
[] state = 136 -> 1.0:(state'=122) & (bag1holdblock'= false);
[] state = 137 -> 1.0:(state'=138) & (bag1holdblock'= false);
[] state = 138 -> 1.0:(state'=157) & (bag1holdblock'= false);
[] state = 139 -> 0.5:(state'=140) & (bag1holdblock'= false);
[] state = 140 -> 0.5:(state'=108) & (bag1holdblock'= false) + 0.5:(state'=141) & (bag1holdblock'= false);
[] state = 141 -> 0.5:(state'=120) & (bag1holdblock'= false) + 0.5:(state'=142) & (bag1holdblock'= false);
[] state = 142 -> 1.0:(state'=156) & (bag1holdblock'= false);
[] state = 143 -> 0.5:(state'=144) & (bag1holdblock'= false);
[] state = 144 -> 0.3333333333333333:(state'=145) & (bag1holdblock'= false) + 0.3333333333333333:(state'=156) & (bag1holdblock'= false);
[] state = 145 -> 0.3333333333333333:(state'=146) & (bag1holdblock'= false) + 0.3333333333333333:(state'=139) & (bag1holdblock'= false);
[] state = 146 -> 0.5:(state'=147) & (bag1holdblock'= false) + 0.5:(state'=152) & (bag1holdblock'= false);
[] state = 147 -> 0.5:(state'=148) & (bag1holdblock'= false) + 0.5:(state'=150) & (bag1holdblock'= false);
[] state = 148 -> 0.3333333333333333:(state'=112) & (bag1holdblock'= false) + 0.3333333333333333:(state'=149) & (bag1holdblock'= false);
[] state = 149 -> 1.0:(state'=111) & (bag1holdblock'= false);
[] state = 150 -> 0.3333333333333333:(state'=117) & (bag1holdblock'= false) + 0.3333333333333333:(state'=151) & (bag1holdblock'= false);
[] state = 151 -> 1.0:(state'=116) & (bag1holdblock'= false);
[] state = 152 -> 0.5:(state'=153) & (bag1holdblock'= false) + 0.5:(state'=155) & (bag1holdblock'= false);
[] state = 153 -> 0.3333333333333333:(state'=154) & (bag1holdblock'= false) + 0.3333333333333333:(state'=123) & (bag1holdblock'= false);
[] state = 154 -> 1.0:(state'=122) & (bag1holdblock'= false);
[] state = 155 -> 1.0:(state'=138) & (bag1holdblock'= false);
[] state = 156 -> 0.5:(state'=127) & (bag1holdblock'= false);
endmodule