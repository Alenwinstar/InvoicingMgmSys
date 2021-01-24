import { UserEffects } from './user.effects';
import { RouterEffects } from './router.effects';
import { ReportEffects } from './report.effects';

export const effects: any[] = [UserEffects, RouterEffects, ReportEffects];

export * from './user.effects';
export * from './router.effects';
export * from './report.effects';
