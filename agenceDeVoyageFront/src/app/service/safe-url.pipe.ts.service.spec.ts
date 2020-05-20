import { TestBed } from '@angular/core/testing';

import { SafeUrl.Pipe.TsService } from './safe-url.pipe.ts.service';

describe('SafeUrl.Pipe.TsService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: SafeUrl.Pipe.TsService = TestBed.get(SafeUrl.Pipe.TsService);
    expect(service).toBeTruthy();
  });
});
