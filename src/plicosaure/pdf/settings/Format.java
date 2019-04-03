package plicosaure.pdf.settings;

/**
 * Class representing a document Format
 */
public enum Format {
    //region //////////////////////////////////////////// FORMATS //////////////////////////////////////////////////////

    // ISO 216 A Series + 2 SIS 014711 extensions
        A0                       ( 2383.937,  3370.394), // = (  841 width 1189 ) mm  = ( 33.11 width 46.81 ) in
        A1                       ( 1683.780,  2383.937), // = (  594 width 841  ) mm  = ( 23.39 width 33.11 ) in
		A2                       ( 1190.551,  1683.780), // = (  420 width 594  ) mm  = ( 16.54 width 23.39 ) in
		A3                       (  841.890,  1190.551), // = (  297 width 420  ) mm  = ( 11.69 width 16.54 ) in
		A4                       (  595.276,   841.890), // = (  210 width 297  ) mm  = (  8.27 width 11.69 ) in
		A5                       (  419.528,   595.276), // = (  148 width 210  ) mm  = (  5.83 width 8.27  ) in
		A6                       (  297.638,   419.528), // = (  105 width 148  ) mm  = (  4.13 width 5.83  ) in
		A7                       (  209.764,   297.638), // = (   74 width 105  ) mm  = (  2.91 width 4.13  ) in
		A8                       (  147.402,   209.764), // = (   52 width 74   ) mm  = (  2.05 width 2.91  ) in
		A9                       (  104.882,   147.402), // = (   37 width 52   ) mm  = (  1.46 width 2.05  ) in
		A10                      (   73.701,   104.882), // = (   26 width 37   ) mm  = (  1.02 width 1.46  ) in
		A11                      (   51.024,    73.701), // = (   18 width 26   ) mm  = (  0.71 width 1.02  ) in
		A12                      (   36.850,    51.024), // = (   13 width 18   ) mm  = (  0.51 width 0.71  ) in
    // ISO 216 B Series + 2 SIS 014711 extensions
		B0                       ( 2834.646,  4008.189), // = ( 1000 width 1414 ) mm  = ( 39.37 width 55.67 ) in
		B1                       ( 2004.094,  2834.646), // = (  707 width 1000 ) mm  = ( 27.83 width 39.37 ) in
		B2                       ( 1417.323,  2004.094), // = (  500 width 707  ) mm  = ( 19.69 width 27.83 ) in
		B3                       ( 1000.630,  1417.323), // = (  353 width 500  ) mm  = ( 13.90 width 19.69 ) in
		B4                       (  708.661,  1000.630), // = (  250 width 353  ) mm  = (  9.84 width 13.90 ) in
		B5                       (  498.898,   708.661), // = (  176 width 250  ) mm  = (  6.93 width 9.84  ) in
		B6                       (  354.331,   498.898), // = (  125 width 176  ) mm  = (  4.92 width 6.93  ) in
		B7                       (  249.449,   354.331), // = (   88 width 125  ) mm  = (  3.46 width 4.92  ) in
		B8                       (  175.748,   249.449), // = (   62 width 88   ) mm  = (  2.44 width 3.46  ) in
		B9                       (  124.724,   175.748), // = (   44 width 62   ) mm  = (  1.73 width 2.44  ) in
		B10                      (   87.874,   124.724), // = (   31 width 44   ) mm  = (  1.22 width 1.73  ) in
		B11                      (   62.362,    87.874), // = (   22 width 31   ) mm  = (  0.87 width 1.22  ) in
		B12                      (   42.520,    62.362), // = (   15 width 22   ) mm  = (  0.59 width 0.87  ) in
    // ISO 216 C Series + 2 SIS 014711 extensions + 5 EXTENSION
		C0                       ( 2599.370,  3676.535), // = (  917 width 1297 ) mm  = ( 36.10 width 51.06 ) in
		C1                       ( 1836.850,  2599.370), // = (  648 width 917  ) mm  = ( 25.51 width 36.10 ) in
		C2                       ( 1298.268,  1836.850), // = (  458 width 648  ) mm  = ( 18.03 width 25.51 ) in
		C3                       (  918.425,  1298.268), // = (  324 width 458  ) mm  = ( 12.76 width 18.03 ) in
		C4                       (  649.134,   918.425), // = (  229 width 324  ) mm  = (  9.02 width 12.76 ) in
		C5                       (  459.213,   649.134), // = (  162 width 229  ) mm  = (  6.38 width 9.02  ) in
		C6                       (  323.150,   459.213), // = (  114 width 162  ) mm  = (  4.49 width 6.38  ) in
		C7                       (  229.606,   323.150), // = (   81 width 114  ) mm  = (  3.19 width 4.49  ) in
		C8                       (  161.575,   229.606), // = (   57 width 81   ) mm  = (  2.24 width 3.19  ) in
		C9                       (  113.386,   161.575), // = (   40 width 57   ) mm  = (  1.57 width 2.24  ) in
		C10                      (   79.370,   113.386), // = (   28 width 40   ) mm  = (  1.10 width 1.57  ) in
		C11                      (   56.693,    79.370), // = (   20 width 28   ) mm  = (  0.79 width 1.10  ) in
		C12                      (   39.685,    56.693), // = (   14 width 20   ) mm  = (  0.55 width 0.79  ) in
		C76                      (  229.606,   459.213), // = (   81 width 162  ) mm  = (  3.19 width 6.38  ) in
		DL                       (  311.811,   623.622), // = (  110 width 220  ) mm  = (  4.33 width 8.66  ) in
		DLE                      (  323.150,   637.795), // = (  114 width 225  ) mm  = (  4.49 width 8.86  ) in
		DLX                      (  340.158,   666.142), // = (  120 width 235  ) mm  = (  4.72 width 9.25  ) in
		DLP                      (  280.630,   595.276), // = (   99 width 210  ) mm  = (  3.90 width 8.27  ) in (1/3 A4)
    // SIS 014711 E Series
		E0                       ( 2491.654,  3517.795), // = (  879 width 1241 ) mm  = ( 34.61 width 48.86 ) in
		E1                       ( 1757.480,  2491.654), // = (  620 width 879  ) mm  = ( 24.41 width 34.61 ) in
		E2                       ( 1247.244,  1757.480), // = (  440 width 620  ) mm  = ( 17.32 width 24.41 ) in
		E3                       (  878.740,  1247.244), // = (  310 width 440  ) mm  = ( 12.20 width 17.32 ) in
		E4                       (  623.622,   878.740), // = (  220 width 310  ) mm  = (  8.66 width 12.20 ) in
		E5                       (  439.370,   623.622), // = (  155 width 220  ) mm  = (  6.10 width 8.66  ) in
		E6                       (  311.811,   439.370), // = (  110 width 155  ) mm  = (  4.33 width 6.10  ) in
		E7                       (  221.102,   311.811), // = (   78 width 110  ) mm  = (  3.07 width 4.33  ) in
		E8                       (  155.906,   221.102), // = (   55 width 78   ) mm  = (  2.17 width 3.07  ) in
		E9                       (  110.551,   155.906), // = (   39 width 55   ) mm  = (  1.54 width 2.17  ) in
		E10                      (   76.535,   110.551), // = (   27 width 39   ) mm  = (  1.06 width 1.54  ) in
		E11                      (   53.858,    76.535), // = (   19 width 27   ) mm  = (  0.75 width 1.06  ) in
		E12                      (   36.850,    53.858), // = (   13 width 19   ) mm  = (  0.51 width 0.75  ) in
    // SIS 014711 G Series
		G0                       ( 2715.591,  3838.110), // = (  958 width 1354 ) mm  = ( 37.72 width 53.31 ) in
		G1                       ( 1919.055,  2715.591), // = (  677 width 958  ) mm  = ( 26.65 width 37.72 ) in
		G2                       ( 1357.795,  1919.055), // = (  479 width 677  ) mm  = ( 18.86 width 26.65 ) in
		G3                       (  958.110,  1357.795), // = (  338 width 479  ) mm  = ( 13.31 width 18.86 ) in
		G4                       (  677.480,   958.110), // = (  239 width 338  ) mm  = (  9.41 width 13.31 ) in
		G5                       (  479.055,   677.480), // = (  169 width 239  ) mm  = (  6.65 width 9.41  ) in
		G6                       (  337.323,   479.055), // = (  119 width 169  ) mm  = (  4.69 width 6.65  ) in
		G7                       (  238.110,   337.323), // = (   84 width 119  ) mm  = (  3.31 width 4.69  ) in
		G8                       (  167.244,   238.110), // = (   59 width 84   ) mm  = (  2.32 width 3.31  ) in
		G9                       (  119.055,   167.244), // = (   42 width 59   ) mm  = (  1.65 width 2.32  ) in
		G10                      (   82.205,   119.055), // = (   29 width 42   ) mm  = (  1.14 width 1.65  ) in
		G11                      (   59.528,    82.205), // = (   21 width 29   ) mm  = (  0.83 width 1.14  ) in
		G12                      (   39.685,    59.528), // = (   14 width 21   ) mm  = (  0.55 width 0.83  ) in
    // ISO Press
		RA0                      ( 2437.795,  3458.268), // = (  860 width 1220 ) mm  = ( 33.86 width 48.03 ) in
		RA1                      ( 1729.134,  2437.795), // = (  610 width 860  ) mm  = ( 24.02 width 33.86 ) in
		RA2                      ( 1218.898,  1729.134), // = (  430 width 610  ) mm  = ( 16.93 width 24.02 ) in
		RA3                      (  864.567,  1218.898), // = (  305 width 430  ) mm  = ( 12.01 width 16.93 ) in
		RA4                      (  609.449,   864.567), // = (  215 width 305  ) mm  = (  8.46 width 12.01 ) in
		SRA0                     ( 2551.181,  3628.346), // = (  900 width 1280 ) mm  = ( 35.43 width 50.39 ) in
		SRA1                     ( 1814.173,  2551.181), // = (  640 width 900  ) mm  = ( 25.20 width 35.43 ) in
		SRA2                     ( 1275.591,  1814.173), // = (  450 width 640  ) mm  = ( 17.72 width 25.20 ) in
		SRA3                     (  907.087,  1275.591), // = (  320 width 450  ) mm  = ( 12.60 width 17.72 ) in
		SRA4                     (  637.795,   907.087), // = (  225 width 320  ) mm  = (  8.86 width 12.60 ) in
    // German DIN 476
		_4A0                     ( 4767.874,  6740.787), // = ( 1682 width 2378 ) mm  = ( 66.22 width 93.62 ) in
		_2A0                     ( 3370.394,  4767.874), // = ( 1189 width 1682 ) mm  = ( 46.81 width 66.22 ) in
    // Variations on the ISO Standard
		A2_EXTRA                 ( 1261.417,  1754.646), // = (  445 width 619  ) mm  = ( 17.52 width 24.37 ) in
		A3PLUS                   (  932.598,  1369.134), // = (  329 width 483  ) mm  = ( 12.95 width 19.02 ) in
		A3_EXTRA                 (  912.756,  1261.417), // = (  322 width 445  ) mm  = ( 12.68 width 17.52 ) in
		A3_SUPER                 (  864.567,  1440.000), // = (  305 width 508  ) mm  = ( 12.01 width 20.00 ) in
		SUPER_A3                 (  864.567,  1380.472), // = (  305 width 487  ) mm  = ( 12.01 width 19.17 ) in
		A4_EXTRA                 (  666.142,   912.756), // = (  235 width 322  ) mm  = (  9.25 width 12.68 ) in
		A4_SUPER                 (  649.134,   912.756), // = (  229 width 322  ) mm  = (  9.02 width 12.68 ) in
		SUPER_A4                 (  643.465,  1009.134), // = (  227 width 356  ) mm  = (  8.94 width 14.02 ) in
		A4_LONG                  (  595.276,   986.457), // = (  210 width 348  ) mm  = (  8.27 width 13.70 ) in
		F4                       (  595.276,   935.433), // = (  210 width 330  ) mm  = (  8.27 width 12.99 ) in
		SO_B5_EXTRA              (  572.598,   782.362), // = (  202 width 276  ) mm  = (  7.95 width 10.87 ) in
		A5_EXTRA                 (  490.394,   666.142), // = (  173 width 235  ) mm  = (  6.81 width 9.25  ) in
    // ANSI Series
		ANSI_E                   ( 2448.000,  3168.000), // = (  864 width 1118 ) mm  = ( 34.00 width 44.00 ) in
		ANSI_D                   ( 1584.000,  2448.000), // = (  559 width 864  ) mm  = ( 22.00 width 34.00 ) in
		ANSI_C                   ( 1224.000,  1584.000), // = (  432 width 559  ) mm  = ( 17.00 width 22.00 ) in
		ANSI_B                   (  792.000,  1224.000), // = (  279 width 432  ) mm  = ( 11.00 width 17.00 ) in
		ANSI_A                   (  612.000,   792.000), // = (  216 width 279  ) mm  = (  8.50 width 11.00 ) in
    // Traditional 'Loose' North American Paper Sizes
		USLEDGER                 ( 1224.000,   792.000), // = (  432 width 279  ) mm  = ( 17.00 width 11.00 ) in
		LEDGER                   ( 1224.000,   792.000), // = (  432 width 279  ) mm  = ( 17.00 width 11.00 ) in
		ORGANIZERK               (  792.000,  1224.000), // = (  279 width 432  ) mm  = ( 11.00 width 17.00 ) in
		BIBLE                    (  792.000,  1224.000), // = (  279 width 432  ) mm  = ( 11.00 width 17.00 ) in
		USTABLOID                (  792.000,  1224.000), // = (  279 width 432  ) mm  = ( 11.00 width 17.00 ) in
		TABLOID                  (  792.000,  1224.000), // = (  279 width 432  ) mm  = ( 11.00 width 17.00 ) in
		ORGANIZERM               (  612.000,   792.000), // = (  216 width 279  ) mm  = (  8.50 width 11.00 ) in
		USLETTER                 (  612.000,   792.000), // = (  216 width 279  ) mm  = (  8.50 width 11.00 ) in
		LETTER                   (  612.000,   792.000), // = (  216 width 279  ) mm  = (  8.50 width 11.00 ) in
		USLEGAL                  (  612.000,  1008.000), // = (  216 width 356  ) mm  = (  8.50 width 14.00 ) in
		LEGAL                    (  612.000,  1008.000), // = (  216 width 356  ) mm  = (  8.50 width 14.00 ) in
		GOVERNMENTLETTER         (  576.000,   756.000), // = (  203 width 267  ) mm  = (  8.00 width 10.50 ) in
		GLETTER                  (  576.000,   756.000), // = (  203 width 267  ) mm  = (  8.00 width 10.50 ) in
		JUNIORLEGAL              (  576.000,   360.000), // = (  203 width 127  ) mm  = (  8.00 width 5.00  ) in
		JLEGAL                   (  576.000,   360.000), // = (  203 width 127  ) mm  = (  8.00 width 5.00  ) in
    // Other North American Paper Sizes
		QUADDEMY                 ( 2520.000,  3240.000), // = (  889 width 1143 ) mm  = ( 35.00 width 45.00 ) in
		SUPER_B                  (  936.000,  1368.000), // = (  330 width 483  ) mm  = ( 13.00 width 19.00 ) in
		QUARTO                   (  648.000,   792.000), // = (  229 width 279  ) mm  = (  9.00 width 11.00 ) in
		GOVERNMENTLEGAL          (  612.000,   936.000), // = (  216 width 330  ) mm  = (  8.50 width 13.00 ) in
		FOLIO                    (  612.000,   936.000), // = (  216 width 330  ) mm  = (  8.50 width 13.00 ) in
		MONARCH                  (  522.000,   756.000), // = (  184 width 267  ) mm  = (  7.25 width 10.50 ) in
		EXECUTIVE                (  522.000,   756.000), // = (  184 width 267  ) mm  = (  7.25 width 10.50 ) in
		ORGANIZERL               (  396.000,   612.000), // = (  140 width 216  ) mm  = (  5.50 width 8.50  ) in
		STATEMENT                (  396.000,   612.000), // = (  140 width 216  ) mm  = (  5.50 width 8.50  ) in
		MEMO                     (  396.000,   612.000), // = (  140 width 216  ) mm  = (  5.50 width 8.50  ) in
		FOOLSCAP                 (  595.440,   936.000), // = (  210 width 330  ) mm  = (  8.27 width 13.00 ) in
		COMPACT                  (  306.000,   486.000), // = (  108 width 171  ) mm  = (  4.25 width 6.75  ) in
		ORGANIZERJ               (  198.000,   360.000), // = (   70 width 127  ) mm  = (  2.75 width 5.00  ) in
    // Canadian standard CAN 2-9.60M
		P1                       ( 1587.402,  2437.795), // = (  560 width 860  ) mm  = ( 22.05 width 33.86 ) in
		P2                       ( 1218.898,  1587.402), // = (  430 width 560  ) mm  = ( 16.93 width 22.05 ) in
		P3                       (  793.701,  1218.898), // = (  280 width 430  ) mm  = ( 11.02 width 16.93 ) in
		P4                       (  609.449,   793.701), // = (  215 width 280  ) mm  = (  8.46 width 11.02 ) in
		P5                       (  396.850,   609.449), // = (  140 width 215  ) mm  = (  5.51 width 8.46  ) in
		P6                       (  303.307,   396.850), // = (  107 width 140  ) mm  = (  4.21 width 5.51  ) in
    // North American Architectural Sizes
		ARCH_E                   ( 2592.000,  3456.000), // = (  914 width 1219 ) mm  = ( 36.00 width 48.00 ) in
		ARCH_E1                  ( 2160.000,  3024.000), // = (  762 width 1067 ) mm  = ( 30.00 width 42.00 ) in
		ARCH_D                   ( 1728.000,  2592.000), // = (  610 width 914  ) mm  = ( 24.00 width 36.00 ) in
		BROADSHEET               ( 1296.000,  1728.000), // = (  457 width 610  ) mm  = ( 18.00 width 24.00 ) in
		ARCH_C                   ( 1296.000,  1728.000), // = (  457 width 610  ) mm  = ( 18.00 width 24.00 ) in
		ARCH_B                   (  864.000,  1296.000), // = (  305 width 457  ) mm  = ( 12.00 width 18.00 ) in
		ARCH_A                   (  648.000,   864.000), // = (  229 width 305  ) mm  = (  9.00 width 12.00 ) in
    // -- North American Envelope Sizes
    // - Announcement Envelopes
		ANNENV_A2                (  314.640,   414.000), // = (  111 width 146  ) mm  = (  4.37 width 5.75  ) in
		ANNENV_A6                (  342.000,   468.000), // = (  121 width 165  ) mm  = (  4.75 width 6.50  ) in
		ANNENV_A7                (  378.000,   522.000), // = (  133 width 184  ) mm  = (  5.25 width 7.25  ) in
		ANNENV_A8                (  396.000,   584.640), // = (  140 width 206  ) mm  = (  5.50 width 8.12  ) in
		ANNENV_A10               (  450.000,   692.640), // = (  159 width 244  ) mm  = (  6.25 width 9.62  ) in
		ANNENV_SLIM              (  278.640,   638.640), // = (   98 width 225  ) mm  = (  3.87 width 8.87  ) in
    // - Commercial Envelopes
		COMMENV_N6_ONE_QUARTER   (  252.000,   432.000), // = (   89 width 152  ) mm  = (  3.50 width 6.00  ) in
		COMMENV_N6_THREE_QUARTERS(  260.640,   468.000), // = (   92 width 165  ) mm  = (  3.62 width 6.50  ) in
		COMMENV_N8               (  278.640,   540.000), // = (   98 width 191  ) mm  = (  3.87 width 7.50  ) in
		COMMENV_N9               (  278.640,   638.640), // = (   98 width 225  ) mm  = (  3.87 width 8.87  ) in
		COMMENV_N10              (  296.640,   684.000), // = (  105 width 241  ) mm  = (  4.12 width 9.50  ) in
		COMMENV_N11              (  324.000,   746.640), // = (  114 width 263  ) mm  = (  4.50 width 10.37 ) in
		COMMENV_N12              (  342.000,   792.000), // = (  121 width 279  ) mm  = (  4.75 width 11.00 ) in
		COMMENV_N14              (  360.000,   828.000), // = (  127 width 292  ) mm  = (  5.00 width 11.50 ) in
    // - Catalogue Envelopes
		CATENV_N1                (  432.000,   648.000), // = (  152 width 229  ) mm  = (  6.00 width 9.00  ) in
		CATENV_N1_THREE_QUARTERS (  468.000,   684.000), // = (  165 width 241  ) mm  = (  6.50 width 9.50  ) in
		CATENV_N2                (  468.000,   720.000), // = (  165 width 254  ) mm  = (  6.50 width 10.00 ) in
		CATENV_N3                (  504.000,   720.000), // = (  178 width 254  ) mm  = (  7.00 width 10.00 ) in
		CATENV_N6                (  540.000,   756.000), // = (  191 width 267  ) mm  = (  7.50 width 10.50 ) in
		CATENV_N7                (  576.000,   792.000), // = (  203 width 279  ) mm  = (  8.00 width 11.00 ) in
		CATENV_N8                (  594.000,   810.000), // = (  210 width 286  ) mm  = (  8.25 width 11.25 ) in
		CATENV_N9_ONE_HALF       (  612.000,   756.000), // = (  216 width 267  ) mm  = (  8.50 width 10.50 ) in
		CATENV_N9_THREE_QUARTERS (  630.000,   810.000), // = (  222 width 286  ) mm  = (  8.75 width 11.25 ) in
		CATENV_N10_ONE_HALF      (  648.000,   864.000), // = (  229 width 305  ) mm  = (  9.00 width 12.00 ) in
		CATENV_N12_ONE_HALF      (  684.000,   900.000), // = (  241 width 318  ) mm  = (  9.50 width 12.50 ) in
		CATENV_N13_ONE_HALF      (  720.000,   936.000), // = (  254 width 330  ) mm  = ( 10.00 width 13.00 ) in
		CATENV_N14_ONE_QUARTER   (  810.000,   882.000), // = (  286 width 311  ) mm  = ( 11.25 width 12.25 ) in
		CATENV_N14_ONE_HALF      (  828.000,  1044.000), // = (  292 width 368  ) mm  = ( 11.50 width 14.50 ) in
    // Japanese (JIS P 0138-61) Standard B-Series
		JIS_B0                   ( 2919.685,  4127.244), // = ( 1030 width 1456 ) mm  = ( 40.55 width 57.32 ) in
		JIS_B1                   ( 2063.622,  2919.685), // = (  728 width 1030 ) mm  = ( 28.66 width 40.55 ) in
		JIS_B2                   ( 1459.843,  2063.622), // = (  515 width 728  ) mm  = ( 20.28 width 28.66 ) in
		JIS_B3                   ( 1031.811,  1459.843), // = (  364 width 515  ) mm  = ( 14.33 width 20.28 ) in
		JIS_B4                   (  728.504,  1031.811), // = (  257 width 364  ) mm  = ( 10.12 width 14.33 ) in
		JIS_B5                   (  515.906,   728.504), // = (  182 width 257  ) mm  = (  7.17 width 10.12 ) in
		JIS_B6                   (  362.835,   515.906), // = (  128 width 182  ) mm  = (  5.04 width 7.17  ) in
		JIS_B7                   (  257.953,   362.835), // = (   91 width 128  ) mm  = (  3.58 width 5.04  ) in
		JIS_B8                   (  181.417,   257.953), // = (   64 width 91   ) mm  = (  2.52 width 3.58  ) in
		JIS_B9                   (  127.559,   181.417), // = (   45 width 64   ) mm  = (  1.77 width 2.52  ) in
		JIS_B10                  (   90.709,   127.559), // = (   32 width 45   ) mm  = (  1.26 width 1.77  ) in
		JIS_B11                  (   62.362,    90.709), // = (   22 width 32   ) mm  = (  0.87 width 1.26  ) in
		JIS_B12                  (   45.354,    62.362), // = (   16 width 22   ) mm  = (  0.63 width 0.87  ) in
    // PA Series
		PA0                      ( 2381.102,  3174.803), // = (  840 width 1120 ) mm  = ( 33.07 width 44.09 ) in
		PA1                      ( 1587.402,  2381.102), // = (  560 width 840  ) mm  = ( 22.05 width 33.07 ) in
		PA2                      ( 1190.551,  1587.402), // = (  420 width 560  ) mm  = ( 16.54 width 22.05 ) in
		PA3                      (  793.701,  1190.551), // = (  280 width 420  ) mm  = ( 11.02 width 16.54 ) in
		PA4                      (  595.276,   793.701), // = (  210 width 280  ) mm  = (  8.27 width 11.02 ) in
		PA5                      (  396.850,   595.276), // = (  140 width 210  ) mm  = (  5.51 width 8.27  ) in
		PA6                      (  297.638,   396.850), // = (  105 width 140  ) mm  = (  4.13 width 5.51  ) in
		PA7                      (  198.425,   297.638), // = (   70 width 105  ) mm  = (  2.76 width 4.13  ) in
		PA8                      (  147.402,   198.425), // = (   52 width 70   ) mm  = (  2.05 width 2.76  ) in
		PA9                      (   99.213,   147.402), // = (   35 width 52   ) mm  = (  1.38 width 2.05  ) in
		PA10                     (   73.701,    99.213), // = (   26 width 35   ) mm  = (  1.02 width 1.38  ) in
    // Standard Photographic Print Sizes
		PASSPORT_PHOTO           (   99.213,   127.559), // = (   35 width 45   ) mm  = (  1.38 width 1.77  ) in
		E                        (  233.858,   340.157), // = (   82 width 120  ) mm  = (  3.25 width 4.72  ) in
		L                        (  252.283,   360.000), // = (   89 width 127  ) mm  = (  3.50 width 5.00  ) in
		_3R                      (  252.283,   360.000), // = (   89 width 127  ) mm  = (  3.50 width 5.00  ) in
		KG                       (  289.134,   430.866), // = (  102 width 152  ) mm  = (  4.02 width 5.98  ) in
		_4R                      (  289.134,   430.866), // = (  102 width 152  ) mm  = (  4.02 width 5.98  ) in
		_4D                      (  340.157,   430.866), // = (  120 width 152  ) mm  = (  4.72 width 5.98  ) in
		_2L                      (  360.000,   504.567), // = (  127 width 178  ) mm  = (  5.00 width 7.01  ) in
		_5R                      (  360.000,   504.567), // = (  127 width 178  ) mm  = (  5.00 width 7.01  ) in
		_8P                      (  430.866,   575.433), // = (  152 width 203  ) mm  = (  5.98 width 7.99  ) in
		_6R                      (  430.866,   575.433), // = (  152 width 203  ) mm  = (  5.98 width 7.99  ) in
		_6P                      (  575.433,   720.000), // = (  203 width 254  ) mm  = (  7.99 width 10.00 ) in
		_8R                      (  575.433,   720.000), // = (  203 width 254  ) mm  = (  7.99 width 10.00 ) in
		_6PW                     (  575.433,   864.567), // = (  203 width 305  ) mm  = (  7.99 width 12.01 ) in
		S8R                      (  575.433,   864.567), // = (  203 width 305  ) mm  = (  7.99 width 12.01 ) in
		_4P                      (  720.000,   864.567), // = (  254 width 305  ) mm  = ( 10.00 width 12.01 ) in
		_10R                     (  720.000,   864.567), // = (  254 width 305  ) mm  = ( 10.00 width 12.01 ) in
		_4PW                     (  720.000,  1080.000), // = (  254 width 381  ) mm  = ( 10.00 width 15.00 ) in
		S10R                     (  720.000,  1080.000), // = (  254 width 381  ) mm  = ( 10.00 width 15.00 ) in
		_11R                     (  790.866,  1009.134), // = (  279 width 356  ) mm  = ( 10.98 width 14.02 ) in
		S11R                     (  790.866,  1224.567), // = (  279 width 432  ) mm  = ( 10.98 width 17.01 ) in
		_12R                     (  864.567,  1080.000), // = (  305 width 381  ) mm  = ( 12.01 width 15.00 ) in
		S12R                     (  864.567,  1292.598), // = (  305 width 456  ) mm  = ( 12.01 width 17.95 ) in
    // Common Newspaper Sizes
		NEWSPAPER_BROADSHEET     ( 2125.984,  1700.787), // = (  750 width 600  ) mm  = ( 29.53 width 23.62 ) in
		NEWSPAPER_BERLINER       ( 1332.283,   892.913), // = (  470 width 315  ) mm  = ( 18.50 width 12.40 ) in
		NEWSPAPER_TABLOID        ( 1218.898,   793.701), // = (  430 width 280  ) mm  = ( 16.93 width 11.02 ) in
		NEWSPAPER_COMPACT        ( 1218.898,   793.701), // = (  430 width 280  ) mm  = ( 16.93 width 11.02 ) in
    // Business Cards
		CREDIT_CARD              (  153.014,   242.646), // = (   54 width 86   ) mm  = (  2.13 width 3.37  ) in
		BUSINESS_CARD            (  153.014,   242.646), // = (   54 width 86   ) mm  = (  2.13 width 3.37  ) in
		BUSINESS_CARD_ISO7810    (  153.014,   242.646), // = (   54 width 86   ) mm  = (  2.13 width 3.37  ) in
		BUSINESS_CARD_ISO216     (  147.402,   209.764), // = (   52 width 74   ) mm  = (  2.05 width 2.91  ) in
		BUSINESS_CARD_IT         (  155.906,   240.945), // = (   55 width 85   ) mm  = (  2.17 width 3.35  ) in
		BUSINESS_CARD_UK         (  155.906,   240.945), // = (   55 width 85   ) mm  = (  2.17 width 3.35  ) in
		BUSINESS_CARD_FR         (  155.906,   240.945), // = (   55 width 85   ) mm  = (  2.17 width 3.35  ) in
		BUSINESS_CARD_DE         (  155.906,   240.945), // = (   55 width 85   ) mm  = (  2.17 width 3.35  ) in
		BUSINESS_CARD_ES         (  155.906,   240.945), // = (   55 width 85   ) mm  = (  2.17 width 3.35  ) in
		BUSINESS_CARD_CA         (  144.567,   252.283), // = (   51 width 89   ) mm  = (  2.01 width 3.50  ) in
		BUSINESS_CARD_US         (  144.567,   252.283), // = (   51 width 89   ) mm  = (  2.01 width 3.50  ) in
		BUSINESS_CARD_JP         (  155.906,   257.953), // = (   55 width 91   ) mm  = (  2.17 width 3.58  ) in
		BUSINESS_CARD_HK         (  153.071,   255.118), // = (   54 width 90   ) mm  = (  2.13 width 3.54  ) in
		BUSINESS_CARD_AU         (  155.906,   255.118), // = (   55 width 90   ) mm  = (  2.17 width 3.54  ) in
		BUSINESS_CARD_DK         (  155.906,   255.118), // = (   55 width 90   ) mm  = (  2.17 width 3.54  ) in
		BUSINESS_CARD_SE         (  155.906,   255.118), // = (   55 width 90   ) mm  = (  2.17 width 3.54  ) in
		BUSINESS_CARD_RU         (  141.732,   255.118), // = (   50 width 90   ) mm  = (  1.97 width 3.54  ) in
		BUSINESS_CARD_CZ         (  141.732,   255.118), // = (   50 width 90   ) mm  = (  1.97 width 3.54  ) in
		BUSINESS_CARD_FI         (  141.732,   255.118), // = (   50 width 90   ) mm  = (  1.97 width 3.54  ) in
		BUSINESS_CARD_HU         (  141.732,   255.118), // = (   50 width 90   ) mm  = (  1.97 width 3.54  ) in
		BUSINESS_CARD_IL         (  141.732,   255.118), // = (   50 width 90   ) mm  = (  1.97 width 3.54  ) in
    // Billboards
		_4SHEET                  ( 2880.000,  4320.000), // = ( 1016 width 1524 ) mm  = ( 40.00 width 60.00 ) in
		_6SHEET                  ( 3401.575,  5102.362), // = ( 1200 width 1800 ) mm  = ( 47.24 width 70.87 ) in
		_12SHEET                 ( 8640.000,  4320.000), // = ( 3048 width 1524 ) mm  = (120.00 width 60.00 ) in
		_16SHEET                 ( 5760.000,  8640.000), // = ( 2032 width 3048 ) mm  = ( 80.00 width 120.00) in
		_32SHEET                 (11520.000,  8640.000), // = ( 4064 width 3048 ) mm  = (160.00 width 120.00) in
		_48SHEET                 (17280.000,  8640.000), // = ( 6096 width 3048 ) mm  = (240.00 width 120.00) in
		_64SHEET                 (23040.000,  8640.000), // = ( 8128 width 3048 ) mm  = (320.00 width 120.00) in
		_96SHEET                 (34560.000,  8640.000), // = (12192 width 3048 ) mm  = (480.00 width 120.00) in
    // -- Old European Sizes
    // - Old Imperial English Sizes
		EN_EMPEROR               ( 3456.000,  5184.000), // = ( 1219 width 1829 ) mm  = ( 48.00 width 72.00 ) in
		EN_ANTIQUARIAN           ( 2232.000,  3816.000), // = (  787 width 1346 ) mm  = ( 31.00 width 53.00 ) in
		EN_GRAND_EAGLE           ( 2070.000,  3024.000), // = (  730 width 1067 ) mm  = ( 28.75 width 42.00 ) in
		EN_DOUBLE_ELEPHANT       ( 1926.000,  2880.000), // = (  679 width 1016 ) mm  = ( 26.75 width 40.00 ) in
		EN_ATLAS                 ( 1872.000,  2448.000), // = (  660 width 864  ) mm  = ( 26.00 width 34.00 ) in
		EN_COLOMBIER             ( 1692.000,  2484.000), // = (  597 width 876  ) mm  = ( 23.50 width 34.50 ) in
		EN_ELEPHANT              ( 1656.000,  2016.000), // = (  584 width 711  ) mm  = ( 23.00 width 28.00 ) in
		EN_DOUBLE_DEMY           ( 1620.000,  2556.000), // = (  572 width 902  ) mm  = ( 22.50 width 35.50 ) in
		EN_IMPERIAL              ( 1584.000,  2160.000), // = (  559 width 762  ) mm  = ( 22.00 width 30.00 ) in
		EN_PRINCESS              ( 1548.000,  2016.000), // = (  546 width 711  ) mm  = ( 21.50 width 28.00 ) in
		EN_CARTRIDGE             ( 1512.000,  1872.000), // = (  533 width 660  ) mm  = ( 21.00 width 26.00 ) in
		EN_DOUBLE_LARGE_POST     ( 1512.000,  2376.000), // = (  533 width 838  ) mm  = ( 21.00 width 33.00 ) in
		EN_ROYAL                 ( 1440.000,  1800.000), // = (  508 width 635  ) mm  = ( 20.00 width 25.00 ) in
		EN_SHEET                 ( 1404.000,  1692.000), // = (  495 width 597  ) mm  = ( 19.50 width 23.50 ) in
		EN_HALF_POST             ( 1404.000,  1692.000), // = (  495 width 597  ) mm  = ( 19.50 width 23.50 ) in
		EN_SUPER_ROYAL           ( 1368.000,  1944.000), // = (  483 width 686  ) mm  = ( 19.00 width 27.00 ) in
		EN_DOUBLE_POST           ( 1368.000,  2196.000), // = (  483 width 775  ) mm  = ( 19.00 width 30.50 ) in
		EN_MEDIUM                ( 1260.000,  1656.000), // = (  445 width 584  ) mm  = ( 17.50 width 23.00 ) in
		EN_DEMY                  ( 1260.000,  1620.000), // = (  445 width 572  ) mm  = ( 17.50 width 22.50 ) in
		EN_LARGE_POST            ( 1188.000,  1512.000), // = (  419 width 533  ) mm  = ( 16.50 width 21.00 ) in
		EN_COPY_DRAUGHT          ( 1152.000,  1440.000), // = (  406 width 508  ) mm  = ( 16.00 width 20.00 ) in
		EN_POST                  ( 1116.000,  1386.000), // = (  394 width 489  ) mm  = ( 15.50 width 19.25 ) in
		EN_CROWN                 ( 1080.000,  1440.000), // = (  381 width 508  ) mm  = ( 15.00 width 20.00 ) in
		EN_PINCHED_POST          ( 1062.000,  1332.000), // = (  375 width 470  ) mm  = ( 14.75 width 18.50 ) in
		EN_BRIEF                 (  972.000,  1152.000), // = (  343 width 406  ) mm  = ( 13.50 width 16.00 ) in
		EN_FOOLSCAP              (  972.000,  1224.000), // = (  343 width 432  ) mm  = ( 13.50 width 17.00 ) in
		EN_SMALL_FOOLSCAP        (  954.000,  1188.000), // = (  337 width 419  ) mm  = ( 13.25 width 16.50 ) in
		EN_POTT                  (  900.000,  1080.000), // = (  318 width 381  ) mm  = ( 12.50 width 15.00 ) in
    // - Old Imperial Belgian Sizes
		BE_GRAND_AIGLE           ( 1984.252,  2948.031), // = (  700 width 1040 ) mm  = ( 27.56 width 40.94 ) in
		BE_COLOMBIER             ( 1757.480,  2409.449), // = (  620 width 850  ) mm  = ( 24.41 width 33.46 ) in
		BE_DOUBLE_CARRE          ( 1757.480,  2607.874), // = (  620 width 920  ) mm  = ( 24.41 width 36.22 ) in
		BE_ELEPHANT              ( 1746.142,  2182.677), // = (  616 width 770  ) mm  = ( 24.25 width 30.31 ) in
		BE_PETIT_AIGLE           ( 1700.787,  2381.102), // = (  600 width 840  ) mm  = ( 23.62 width 33.07 ) in
		BE_GRAND_JESUS           ( 1559.055,  2069.291), // = (  550 width 730  ) mm  = ( 21.65 width 28.74 ) in
		BE_JESUS                 ( 1530.709,  2069.291), // = (  540 width 730  ) mm  = ( 21.26 width 28.74 ) in
		BE_RAISIN                ( 1417.323,  1842.520), // = (  500 width 650  ) mm  = ( 19.69 width 25.59 ) in
		BE_GRAND_MEDIAN          ( 1303.937,  1714.961), // = (  460 width 605  ) mm  = ( 18.11 width 23.82 ) in
		BE_DOUBLE_POSTE          ( 1233.071,  1601.575), // = (  435 width 565  ) mm  = ( 17.13 width 22.24 ) in
		BE_COQUILLE              ( 1218.898,  1587.402), // = (  430 width 560  ) mm  = ( 16.93 width 22.05 ) in
		BE_PETIT_MEDIAN          ( 1176.378,  1502.362), // = (  415 width 530  ) mm  = ( 16.34 width 20.87 ) in
		BE_RUCHE                 ( 1020.472,  1303.937), // = (  360 width 460  ) mm  = ( 14.17 width 18.11 ) in
		BE_PROPATRIA             (  977.953,  1218.898), // = (  345 width 430  ) mm  = ( 13.58 width 16.93 ) in
		BE_LYS                   (  898.583,  1125.354), // = (  317 width 397  ) mm  = ( 12.48 width 15.63 ) in
		BE_POT                   (  870.236,  1088.504), // = (  307 width 384  ) mm  = ( 12.09 width 15.12 ) in
		BE_ROSETTE               (  765.354,   983.622), // = (  270 width 347  ) mm  = ( 10.63 width 13.66 ) in
    // - Old Imperial French Sizes
		FR_UNIVERS               ( 2834.646,  3685.039), // = ( 1000 width 1300 ) mm  = ( 39.37 width 51.18 ) in
		FR_DOUBLE_COLOMBIER      ( 2551.181,  3571.654), // = (  900 width 1260 ) mm  = ( 35.43 width 49.61 ) in
		FR_GRANDE_MONDE          ( 2551.181,  3571.654), // = (  900 width 1260 ) mm  = ( 35.43 width 49.61 ) in
		FR_DOUBLE_SOLEIL         ( 2267.717,  3401.575), // = (  800 width 1200 ) mm  = ( 31.50 width 47.24 ) in
		FR_DOUBLE_JESUS          ( 2154.331,  3174.803), // = (  760 width 1120 ) mm  = ( 29.92 width 44.09 ) in
		FR_GRAND_AIGLE           ( 2125.984,  3004.724), // = (  750 width 1060 ) mm  = ( 29.53 width 41.73 ) in
		FR_PETIT_AIGLE           ( 1984.252,  2664.567), // = (  700 width 940  ) mm  = ( 27.56 width 37.01 ) in
		FR_DOUBLE_RAISIN         ( 1842.520,  2834.646), // = (  650 width 1000 ) mm  = ( 25.59 width 39.37 ) in
		FR_JOURNAL               ( 1842.520,  2664.567), // = (  650 width 940  ) mm  = ( 25.59 width 37.01 ) in
		FR_COLOMBIER_AFFICHE     ( 1785.827,  2551.181), // = (  630 width 900  ) mm  = ( 24.80 width 35.43 ) in
		FR_DOUBLE_CAVALIER       ( 1757.480,  2607.874), // = (  620 width 920  ) mm  = ( 24.41 width 36.22 ) in
		FR_CLOCHE                ( 1700.787,  2267.717), // = (  600 width 800  ) mm  = ( 23.62 width 31.50 ) in
		FR_SOLEIL                ( 1700.787,  2267.717), // = (  600 width 800  ) mm  = ( 23.62 width 31.50 ) in
		FR_DOUBLE_CARRE          ( 1587.402,  2551.181), // = (  560 width 900  ) mm  = ( 22.05 width 35.43 ) in
		FR_DOUBLE_COQUILLE       ( 1587.402,  2494.488), // = (  560 width 880  ) mm  = ( 22.05 width 34.65 ) in
		FR_JESUS                 ( 1587.402,  2154.331), // = (  560 width 760  ) mm  = ( 22.05 width 29.92 ) in
		FR_RAISIN                ( 1417.323,  1842.520), // = (  500 width 650  ) mm  = ( 19.69 width 25.59 ) in
		FR_CAVALIER              ( 1303.937,  1757.480), // = (  460 width 620  ) mm  = ( 18.11 width 24.41 ) in
		FR_DOUBLE_COURONNE       ( 1303.937,  2040.945), // = (  460 width 720  ) mm  = ( 18.11 width 28.35 ) in
		FR_CARRE                 ( 1275.591,  1587.402), // = (  450 width 560  ) mm  = ( 17.72 width 22.05 ) in
		FR_COQUILLE              ( 1247.244,  1587.402), // = (  440 width 560  ) mm  = ( 17.32 width 22.05 ) in
		FR_DOUBLE_TELLIERE       ( 1247.244,  1927.559), // = (  440 width 680  ) mm  = ( 17.32 width 26.77 ) in
		FR_DOUBLE_CLOCHE         ( 1133.858,  1700.787), // = (  400 width 600  ) mm  = ( 15.75 width 23.62 ) in
		FR_DOUBLE_POT            ( 1133.858,  1757.480), // = (  400 width 620  ) mm  = ( 15.75 width 24.41 ) in
		FR_ECU                   ( 1133.858,  1474.016), // = (  400 width 520  ) mm  = ( 15.75 width 20.47 ) in
		FR_COURONNE              ( 1020.472,  1303.937), // = (  360 width 460  ) mm  = ( 14.17 width 18.11 ) in
		FR_TELLIERE              (  963.780,  1247.244), // = (  340 width 440  ) mm  = ( 13.39 width 17.32 ) in
		FR_POT                   (  878.740,  1133.858); // = (  310 width 400  ) mm  = ( 12.20 width 15.75 ) in

    //endregion

	/**
	 * The width and height coordinates of the format
	 */
    private double width, height;

	/**
	 * Create a document Format
	 *
	 * @param width the width of the format
	 * @param height the height of the format
	 */
	Format(double width, double height) {
        this.width = width;
        this.height = height;
    }

	/**
	 * Get the width of the format
	 *
	 * @return the width
	 */
	public double getWidth() {
        return width;
    }

	/**
	 * Get the height of the format
	 *
	 * @return the height
	 */
	public double getHeight() {
        return height;
    }
}
